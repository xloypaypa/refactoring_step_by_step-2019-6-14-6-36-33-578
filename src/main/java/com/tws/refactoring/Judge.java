package com.tws.refactoring;

public class Judge {

    /*
        第十七条    已满十六周岁的人犯罪，应当负刑事责任。
        已满十四周岁不满十六周岁的人，犯故意杀人、故意伤害致人重伤或者死亡、强奸、抢劫、贩卖毒品、放火、爆炸、投毒罪的，应当负刑事责任。
        已满十四周岁不满十八周岁的人犯罪，应当从轻或者减轻处罚。
        因不满十六周岁不予刑事处罚的，责令他的家长或者监护人加以管教；在必要的时候，也可以由政府收容教养。
     */
    public boolean checkCriminalResponsibility(Driver driver, boolean isSerious) {
        if (driver.getAge() < 14) {
            return false;
        } else if (driver.getAge() >= 14 && driver.getAge() < 16) {
            return isSerious;
        } else {
            return true;
        }
    }

}
