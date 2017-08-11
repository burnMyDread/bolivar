package org.burnmydread.bolivar.pageobjects.shared

import geb.Module
import org.openqa.selenium.By

/**
 * Created by zach on 5/21/17.
 */
class SideBar extends Module{
    static content = {

        new_item {  $("#tasks").$(By.linkText('New Item')) }
        people { $("#tasks").$(By.linkText('People')) }
        build_history { $("#tasks").$(By.linkText('Build History')) }

        edit_view { $("#tasks").$(By.linkText('Edit View'))  }
        delete_view { $("#tasks").$(By.linkText('Delete View'))  }
        manage_jenkins { $("#tasks").$(By.linkText('Manage Jenkins')) }
        alerts { $("#tasks").$(By.linkText('Alerts')) }
        support { $("#tasks").$(By.linkText('Support')) }
        analytics_dashboard { $("#tasks").$(By.linkText('Analytics Dashboard Creator')) }
        my_views { $("#tasks").$(By.linkText('My Views')) }
        blue_ocean { $("#tasks").$(By.linkText('Open Blue Ocean'))   }
        credentials { $("#tasks").$(By.linkText('Credentials')) }
        cluster_operations { $("#tasks").$(By.linkText('Cluster Operations')) }
        manage { $("#tasks").$(By.linkText('Manage')) }
        disconnect { $("#tasks").$(By.linkText('Disconnect')) }
        stop { $("#tasks").$(By.linkText('Stop')) }
        start { $("#tasks").$(By.linkText('Start')) }
        mcp { $("#tasks").$(By.linkText('Move/Copy/Promote')) }
        view { $("#tasks").$(By.linkText('View')) }
    }
}
