package org.burnmydread.bolivar.pageobjects

import geb.Module

/**
 * Created by zach on 5/21/17.
 */
class DefaultTabs extends Module {

    static content = {
        all { $('#main-panel > div.tabBarFrame > div.tabBar > div:nth-child(1) > a')}
        build_analytics { $('#main-panel > div.tabBarFrame > div.tabBar > div:nth-child(2) > a')}
        logs { $('#main-panel > div.tabBarFrame > div.tabBar > div:nth-child(3) > a')}
        masters { $('#kibana-dashboard > div.tabBarFrame > div.tabBar > div:nth-child(4) > a')}
        performance_analytics { $('#main-panel > div.tabBarFrame > div.tabBar > div:nth-child(5) > a')}
    }

}
