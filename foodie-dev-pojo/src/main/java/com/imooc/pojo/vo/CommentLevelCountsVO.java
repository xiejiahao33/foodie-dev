package com.imooc.pojo.vo;

/**
 * 用于展示商品评价数量的vo
 */
public class CommentLevelCountsVO {

    public Integer totalCounts;  //总评价数
    public Integer goodCounts;   //好评
    public Integer normalCounts;  //中评
    public Integer badCounts;   //差评

    public Integer getTotalCounts() {
        return totalCounts;
    }

    public void setTotalCounts(Integer totalCounts) {
        this.totalCounts = totalCounts;
    }

    public Integer getGoodCounts() {
        return goodCounts;
    }

    public void setGoodCounts(Integer goodCounts) {
        this.goodCounts = goodCounts;
    }

    public Integer getNormalCounts() {
        return normalCounts;
    }

    public void setNormalCounts(Integer normalCounts) {
        this.normalCounts = normalCounts;
    }

    public Integer getBadCounts() {
        return badCounts;
    }

    public void setBadCounts(Integer badCounts) {
        this.badCounts = badCounts;
    }
}
