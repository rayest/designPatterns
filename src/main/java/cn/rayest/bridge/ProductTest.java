package cn.rayest.bridge;

import cn.rayest.bridge.product.corp.impl.HouseCorp;
import cn.rayest.bridge.product.corp.impl.ShanZhaiCorp;
import cn.rayest.bridge.product.product.impl.Clothes;
import cn.rayest.bridge.product.product.impl.House;

public class ProductTest {
    public static void main(String[] args) {
        // 房地产公司
        HouseCorp houseCorp = new HouseCorp(new House());
        houseCorp.makeMoney();

        // 山寨公司
        ShanZhaiCorp shanZhaiCorp = new ShanZhaiCorp(new Clothes());
        shanZhaiCorp.makeMoney();
    }
}
