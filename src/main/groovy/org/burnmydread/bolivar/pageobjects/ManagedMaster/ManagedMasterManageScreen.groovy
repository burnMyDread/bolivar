package org.burnmydread.bolivar.pageobjects.ManagedMaster

import geb.Page
import org.burnmydread.bolivar.pageobjects.shared.Header
import org.burnmydread.bolivar.pageobjects.shared.SideBar

/**
 * Created by zach on 8/11/17.
 */
class ManagedMasterManageScreen extends Page {
    static at = {
        //Wait for all the items on the left side bar
        waitFor(60,0.25) { side_bar.view.present }
        waitFor(10,0.01) { side_bar.manage.present }
        waitFor(120,1) { side_bar.disconnect.present }
        waitFor(10,0.01) { side_bar.stop.present }
        //waitFor(10,0.01) { side_bar.start.present }
        waitFor(10,0.01) { side_bar.mcp.present }
        waitFor(10,0.01) { side_bar.cluster_operations.present }
        waitFor(10,0.01) { side_bar.blue_ocean.present }

        //wait for all the items in the header
        waitFor(60,0.1) { header.bread_crum_trail.present }
        waitFor(10,0.01) { header.jenkins_home.present }
        //waitFor(10,0.01) { header.active_alerts.present }
        waitFor(10,0.01) { header.search.present }
        waitFor(10,0.01) { header.search_help.present }
        waitFor(10,0.01) { header.user_profile.present }
        waitFor(10,0.01) { header.log_out.present }

        //The page spesific content
        waitFor(60,0.1) { status_block.present }
        waitFor(60,0.1) { health_block.present }
    }
    static content = {
        side_bar { module SideBar }
        header { module Header }
        status_block { $('#ajax-status') }
        health_block { $('#main-panel > div:nth-child(7) > h2') }
    }
}
