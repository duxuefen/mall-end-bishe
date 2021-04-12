package com.macro.mall.dao;

import com.macro.mall.model.CmsSubjectProductRelation;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 自定义商品和专题关系操作Dao
 *   /4/26.
 */
@Repository
public interface CmsSubjectProductRelationDao {
    /**
     * 批量创建
     */
    int insertList(@Param("list") List<CmsSubjectProductRelation> subjectProductRelationList);
}
