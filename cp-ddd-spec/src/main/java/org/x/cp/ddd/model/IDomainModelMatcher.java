package org.x.cp.ddd.model;

import javax.validation.constraints.NotNull;

/**
 * 领域模型匹配器, internal usage only.
 * <p>
 * <p>用于定位扩展点实例</p>
 */
public interface IDomainModelMatcher {

    /**
     * 根据领域模型判断是否属于我的业务.
     *
     * @param model 领域模型
     * @return true if yes
     */
    boolean match(@NotNull IDomainModel model);
}