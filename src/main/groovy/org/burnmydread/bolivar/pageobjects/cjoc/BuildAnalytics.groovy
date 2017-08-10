package org.burnmydread.bolivar.pageobjects.cjoc

import geb.Page
import org.burnmydread.bolivar.pageobjects.DefaultTabs
import org.burnmydread.bolivar.pageobjects.shared.Header

/**
 * Created by zach on 8/9/17.
 */
class BuildAnalytics extends Page {
    static url = System.properties.'bolivar.url'
    static at = {
        //wait for all the items in the header
        waitFor(60,0.1) { header.bread_crum_trail.present }
        waitFor(10,0.01) { header.jenkins_home.present }
        //waitFor(10,0.01) { header.active_alerts.present }
        waitFor(10,0.01) { header.search.present }
        waitFor(10,0.01) { header.search_help.present }
        waitFor(10,0.01) { header.user_profile.present }
        waitFor(10,0.01) { header.log_out.present }
        //wait for the tabs above
        waitFor(10,0.01) { tabs.masters.present }
        //content on the page
        waitFor(10,0.01) { side_menu_master_use.present }
        waitFor(10,0.01) { side_menu_build_results.present }
        waitFor(10,0.01) { side_menu_build_runtimes.present }
        waitFor(10,0.01) { side_menu_build_queue.present }
        waitFor(10,0.01) { side_menu_node_performance.present }
        waitFor(10,0.01) { side_menu_total_project.present }
        //waitFor(10,0.01) { graph_title.present }

    }
    static content = {
        header { module Header }
        tabs { module DefaultTabs }
        side_menu_master_use { $('#analytics-side-panel > div.tabs > div.task.tab.active > a.task-link') }
        side_menu_build_results { $('#analytics-side-panel > div.tabs > div:nth-child(2) > a.task-link') }
        side_menu_build_runtimes { $('#analytics-side-panel > div.tabs > div:nth-child(3) > a.task-link') }
        side_menu_build_queue  { $('#analytics-side-panel > div.tabs > div:nth-child(4) > a.task-link') }
        side_menu_node_performance { $('#analytics-side-panel > div.tabs > div:nth-child(5) > a.task-link') }
        side_menu_total_project  { $('#analytics-side-panel > div.tabs > div:nth-child(6) > a.task-link') }
        graph_title { $('body > div.content > div > div > navbar > span') }

    }
}
