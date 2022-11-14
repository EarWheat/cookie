CREATE TABLE `Counters` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `count` int(11) NOT NULL DEFAULT '1',
  `createdAt` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `updatedAt` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;


CREATE TABLE `Task` (
  `id` int (32) NOT NULL AUTO_INCREMENT COMMENT '自增id',
  `user_id` int (16) NOT NULL COMMENT '用户id',
  `task_id` int (8) NOT NULL COMMENT '任务id',
  `task_title` varchar (64) NOT NULL DEFAULT '' COMMENT '任务名称',
  `task_icon` varchar (64) NULL DEFAULT '' COMMENT '任务图标',
  `task_status` varchar (16) NULL DEFAULT 'INITIAL' COMMENT '任务状态',
  `task_max_time` int (8) NULL DEFAULT 1 COMMENT '任务完成最大次数',
  `task_complete_time` int (8) NULL DEFAULT 0 COMMENT '任务已经完成次数',
  `task_award_point` int (16) NULL DEFAULT 0 COMMENT '任务奖励',
  `accept_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '任务接受时间',
  `created_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '任务创建时间',
  `update_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '任务更新时间',
  PRIMARY KEY (`id`),
  index `idx_task_id` USING btree (`task_id`),
  unique `idx_user_id` USING btree (`user_id`)
) COMMENT = "任务列表" ENGINE = innodb DEFAULT CHARACTER SET = "utf8mb4" COLLATE = "utf8mb4_general_ci"