package org.seckill.service;

import org.seckill.dto.Exposer;
import org.seckill.dto.SeckillExecution;
import org.seckill.entity.Seckill;
import org.seckill.exception.RepeatkillException;
import org.seckill.exception.SeckillException;

import java.util.List;

/**
 * Created by Administrator on 2017/3/30.
 */
public interface SeckillService {
    /*
    查询全部的秒杀记录
     */
    List<Seckill> getSeckillList();

    /*
    查询单个的秒杀记录
     */
    Seckill getById(long seckillId);

    /*
    在秒杀开启时输出秒杀接口的地址，否则输出系统时间和秒杀时间
     */
    Exposer exportSeckillUrl(long seckillId);

    /*
    执行秒杀操作，有可能失败，有可能成功，所以要我抛出我们允许的异常
     */
    SeckillExecution executeSeckill(long seckillId, long userPhone, String md5)
            throws SeckillException, RepeatkillException,SeckillException;
}
