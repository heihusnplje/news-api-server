package com.tigerjoys.news.inter.mapper;

import org.apache.ibatis.annotations.Producer;
import com.tigerjoys.nbs.mybatis.core.provider.DefaultSqlProvider;
import com.tigerjoys.news.inter.entity.YdzxInfoEntity;
import com.tigerjoys.nbs.mybatis.core.BaseMapper;
import com.tigerjoys.nbs.mybatis.core.annotation.Mapper;

/**
 * 数据库  [t_ydzx_info]表 dao通用操作接口实现类
 * @author yangjunming
 * @Date 2018-07-12 18:08:25
 *
 */
@Producer(entityType=YdzxInfoEntity.class,providerType=DefaultSqlProvider.class)
@Mapper
public interface YdzxInfoMapper extends BaseMapper<YdzxInfoEntity> {
    
}