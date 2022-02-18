-- 创建数据库
create database nos character set 'utf8';
-- 使用数据库
use nos;
-- 创建用户表
create table user(
    id varchar(20) primary key,
    pwd varchar(20) not null,
    token longtext not null
);
-- 创建用户信息表
create table user_msg(
    id varchar(20) primary key comment 'phone',
    name varchar(20) not null unique,
    sex varchar(3) not null,
    age int not null,
    email varchar(25) not null unique,
    area varchar(10) not null,
    is_admin tinyint(1) default '0' not null,
    is_writer tinyint(1) default '0' not null,
    is_vip tinyint(1) default '0' not null,
    entry_time datetime default CURRENT_TIMESTAMP() not null
)
-- 创建小说表
create table novel(
    novel_id int primary key auto_increment,
    novel_name varchar(30) not null unique,
    novel_icon varchar(40) not null default '暂无图片',
    update_time datetime default 'yyyy-MM-dd hh:mm:ss' comment '最后更新时间',
    list_title varchar(15) comment '排行榜标题',
    cat_title varchar(15) comment '分类标题',
    author_name varchar(20) not null,
    introduction longtext not null,
    is_end tinyint(1) default '0' not null comment '连载/完结',
    is_ban tinyint(1) default '0' not null comment '封禁'
    is_ok tinyint(1) default '0' not null comment '审核'
)auto_increment = 1;
-- 创建小说章节表
create table novel_chapter(
    chap_id int primary key auto_increment,
    novel_id int not null comment '小说id（归属于那本小说）',
    title varchar(30) not null comment '小说章节标题',
    content longtext not null comment '小说章节内容'
);
-- 创建通知表
create table notice(
    notice_id int primary key auto_increment,
    notice_from varchar(50) not null,
    notice_to varchar(50) not null,
    content longtext not null,
    create_time datetime default CURRENT_TIMESTAMP() not null commemt '发布时间'
)
-- 创建月票交易表
create table transaction(
    id int primary key auto_increment,
    user_id varchar(20) not null,
    novel_id int not null,
    mon_ticket int not null comment '单笔月票数',
    time timestamp not null default CURRENT_TIMESTAMP
);
-- 创建书架表
create table bookshelf(
    id varchar(20) comment '用户id',
    novel_id int comment '小说id',
    primary key(id, novel_id)
);