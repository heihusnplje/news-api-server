package com.tigerjoys.news.inter.mapper;

import org.apache.ibatis.annotations.Producer;
import com.tigerjoys.nbs.mybatis.core.provider.DefaultSqlProvider;
import com.tigerjoys.news.inter.entity.YdzxTestEntity;
import com.tigerjoys.nbs.mybatis.core.BaseMapper;
import com.tigerjoys.nbs.mybatis.core.annotation.Mapper;

/**
 * 数据库  [t_ydzx_test]表 dao通用操作接口实现类
 * @author yangjunming
 * @Date 2018-07-16 18:06:16
 *
 */
@Producer(entityType=YdzxTestEntity.class,providerType=DefaultSqlProvider.class)
@Mapper
public interface YdzxTestMapper extends BaseMapper<YdzxTestEntity> {
    
}