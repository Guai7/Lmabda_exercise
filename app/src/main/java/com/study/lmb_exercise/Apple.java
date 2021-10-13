package com.study.lmb_exercise;

/**
 * +----------------------------------------------------------------------
 * | 项   目: Lmb_exercise
 * +----------------------------------------------------------------------
 * | 包   名: com.study.lmb_exercise
 * +----------------------------------------------------------------------
 * | 类   名: Apple
 * +----------------------------------------------------------------------
 * | 时　　间: 2021/10/13 14:57
 * +----------------------------------------------------------------------
 * | 代码创建: 王益德
 * +----------------------------------------------------------------------
 * | 版本信息: V1.0.0
 * +----------------------------------------------------------------------
 * | 功能描述:
 * +----------------------------------------------------------------------
 **/
public class Apple {
    private Integer id;
    private String name;
    private Integer height;

    public Apple() {
    }

    public Apple(Integer id, String name, Integer height) {
        this.id = id;
        this.name = name;
        this.height = height;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Apple{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", height=" + height +
                '}';
    }
}
