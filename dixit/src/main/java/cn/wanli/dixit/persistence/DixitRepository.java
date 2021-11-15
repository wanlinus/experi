package cn.wanli.dixit.persistence;

import cn.wanli.dixit.domain.Dixit;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author wanli
 */
public interface DixitRepository extends JpaRepository<Dixit, Long> {
}
