create table if not exists `auth`.`tb_account`
(
    `id`           int(11) auto_increment,
    `name`         varchar(32) not null comment '用户名',
    `nickname`     varchar(32) not null comment '账户别称',
    `password`     varchar(64) not null comment '密码',
    `email`        varchar(128) comment '账户邮箱',
    `age`          tinyint comment '用户年龄',
    `gender`       varchar(32) comment '性别',
    `created_time` timestamp   not null comment '创建时间',
    `updated_time` timestamp   not null comment '更新时间',
    primary key (`id`)
);

create table if not exists `auth`.`tb_role`
(
    `id`           int(11) auto_increment,
    `name`         varchar(32) not null comment '角色名',
    `grade`        tinyint     not null comment '角色等级 1 超级管理员, 2 普通管理员, 3 普通用户',
    `desc`         varchar(64) comment '角色描述',
    `created_by`   int(11)     not null comment '由谁创建',
    `created_time` timestamp   not null comment '创建时间',
    `updated_time` timestamp   not null comment '更新时间',
    primary key (`id`)
);

create table if not exists `auth`.`tb_account_role`
(
    `id`           int(11) auto_increment,
    `account_id`   int(11)   not null comment '账户id',
    `role_id`      int(11)   not null comment '角色id',
    `created_time` timestamp not null comment '创建时间',
    primary key (`id`)
);

create table if not exists `auth`.`tb_module`
(
    `id`           int(11) auto_increment,
    `name`         varchar(32) not null comment '模块名称',
    `parent_id`    int(11)     not null comment '父节点id',
    `created_time` timestamp   not null comment '创建时间',
    `updated_time` timestamp   not null comment '更新时间',
    primary key (`id`)
);

create table if not exists `auth`.`tb_role_module`
(
    `id`           int(11) auto_increment,
    `role_id`      int(11)   not null comment '角色id',
    `module_id`    int(11)   not null comment '模块id',
    `created_time` timestamp not null comment '创建时间',
    primary key (`id`)
);

create table if not exists `auth`.`tb_operation`
(
    `id`           int(11) auto_increment,
    `name`         varchar(32)  not null comment '操作名称',
    `url`          varchar(250) not null comment '操作路径',
    `method`       varchar(32)  not null comment 'api 方法 get post delete put等',
    `created_time` timestamp    not null comment '创建时间',
    `updated_time` timestamp    not null comment '更新时间',
    primary key (`id`)
);

create table if not exists `auth`.`tb_module_operation`
(
    `id`           int(11) auto_increment,
    `module_id`    int(11)   not null comment '模块id',
    `operation_id` int(11)   not null comment '操作id',
    `created_time` timestamp not null comment '创建时间',
    primary key (`id`)
);

replace into `auth`.`tb_account` (id, name, nickname, password, email, age, gender, created_time, updated_time)
VALUES (1, 'root', 'root', '$2a$15$G5R5PpgsX1x2JKdKSXiBUuVp5I9h5h3ywfRU5ESiHc/NoQMXnHZEm', 'wanlinus@qq.com', 25,
        'MALE', now(), now());
replace into `auth`.`tb_account` (id, name, nickname, password, email, age, gender, created_time, updated_time)
VALUES (2, 'wanli', 'wanli', '$2a$15$G5R5PpgsX1x2JKdKSXiBUuVp5I9h5h3ywfRU5ESiHc/NoQMXnHZEm', 'wanlinus@qq.com', 25,
        'MALE', now(), now());