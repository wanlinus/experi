create table if not exists auth.tb_account
(
    `id`           int(11) auto_increment,
    `name`         varchar(32)   not null comment '用户名',
    `nickname`     varchar(32)   not null comment '账户别称',
    `password`     varbinary(64) not null comment '密码',
    `created_time` timestamp     not null comment '创建时间',
    primary key (id)
);