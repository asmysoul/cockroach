package com.zhangyingwei.cockroach.queue.filter;

import com.zhangyingwei.cockroach.executer.task.Task;

/**
 * @author: zhangyw
 * @date: 2018/1/19
 * @time: 下午2:22
 * @desc:
 */
public interface IQueueTaskFilter {
    boolean accept(Task task);
}
