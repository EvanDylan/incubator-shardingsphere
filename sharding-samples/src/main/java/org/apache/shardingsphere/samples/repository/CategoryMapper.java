package org.apache.shardingsphere.samples.repository;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author qs.zhou
 * @date 2019/05/16
 */
@Mapper
public interface CategoryMapper {

    @Delete("DELETE FROM core_categorys WHERE id = #{id}")
    void deleteById(Long id);

}
