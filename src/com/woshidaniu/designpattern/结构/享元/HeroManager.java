package com.woshidaniu.designpattern.结构.享元;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by kang on 2018/7/8.
 */
//提供共享功能，单例
public class HeroManager {

    private static HeroManager heroManager = new HeroManager();

    private Map<String, AbstractHero> heroMap;

    private HeroManager(){
        heroMap = new HashMap<String, AbstractHero>();
    }

    public static HeroManager getInstance(){
        return heroManager;
    }

    //该方法提供共享功能
    public AbstractHero getHero(String name){
        AbstractHero hero = heroMap.get(name);
        if (hero == null) {
            if (name.equals("恶魔巫师")) {
                hero = new Lion();
            }else if (name.equals("影魔")) {
                hero = new SF();
            }
            heroMap.put(name, hero);
        }
        return hero;
    }
}