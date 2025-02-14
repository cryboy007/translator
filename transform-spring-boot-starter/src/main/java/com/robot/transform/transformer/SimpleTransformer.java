package com.robot.transform.transformer;

import com.robot.transform.annotation.Transform;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

/**
 * 简单转换器接口
 *
 * @author R
 */
public interface SimpleTransformer<T,R> extends Transformer<T, Transform,R> {
    /**
     * 转换
     *
     * @param originalValue 转换之前的原始值
     * @param transform     注解
     * @return 转换后的值
     */
    @Override
    default R transform(@Nonnull T originalValue, @Nullable Transform transform) {
        return transform(originalValue);
    }

    /**
     * 转换
     *
     * @param originalValue 原始值
     * @return 转换后的值
     */
    R transform(@Nonnull T originalValue);


}
