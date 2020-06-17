package cn.wanli.auth;

import cn.wanli.common.utils.JSON;
import org.json.JSONArray;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import java.util.Map;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.toList;

public class Asd {
    private static final Logger logger = LoggerFactory.getLogger(Asd.class);

    @Test
    public void asd() {
        PasswordEncoder passwordEncoder = new BCryptPasswordEncoder(15);
        String encode = passwordEncoder.encode("123456");
        System.out.println(encode);
    }

    @Test
    public void ddsds() {
        List<Integer> collect = IntStream.of(5, 1, 6, 4, 88, 15, 24, 15, 65).sorted().boxed().collect(toList());
        System.out.println(JSON.toJSONString(collect));
    }

    @Test
    public void asd的() {
        String viidUrl = "http://192.168.11.179:10005";
        String url = viidUrl + "/VIID/MotorVehicles";
        HttpHeaders headers = new HttpHeaders();
        headers.set("Content-Type", "application/VIID+JSON");
        headers.set("User-Identify", "41030000000000000011");

        UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(url)
                .queryParam("PlateNo", "鲁DT5289");
        String dd = url + "?PlateNo=鲁DT5289";

        String s = builder.toUriString();

        HttpEntity<?> entity = new HttpEntity<>(headers);
        ResponseEntity<Map> exchange = new RestTemplate().exchange(dd, HttpMethod.GET, entity, Map.class);
        logger.info("VIID车辆查询服务请求url[{}], 请求结果[{}]", JSON.toJSONString(builder.toUriString()), JSON.toJSONString(exchange.getBody()));
        if (!exchange.getStatusCode().is2xxSuccessful()) {
            throw new RuntimeException("VIID车辆查询服务错误" + exchange.getBody());
        }
    }

    @Test
    public void asdddd() {
        byte[] decode = Base64.getDecoder().decode("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");
        String x = Arrays.toString(decode);
        System.out.println(x);
        System.out.println(Base64.getEncoder().encodeToString(x.getBytes(StandardCharsets.UTF_8)));

    }

    @Test
    public void dddsad() {
        JSONArray a = new JSONArray();
        a.put(12);
        a.put("ad");
        System.out.println(a.toString());

    }
}


