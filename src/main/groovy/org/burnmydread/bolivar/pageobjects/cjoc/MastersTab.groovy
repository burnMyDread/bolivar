package org.burnmydread.bolivar.pageobjects.cjoc

import geb.Page
import org.burnmydread.bolivar.pageobjects.DefaultTabs
import org.burnmydread.bolivar.pageobjects.shared.BuildExecutors
import org.burnmydread.bolivar.pageobjects.shared.BuildQueue
import org.burnmydread.bolivar.pageobjects.shared.CurentBuildsInQueue
import org.burnmydread.bolivar.pageobjects.shared.Header
import org.burnmydread.bolivar.pageobjects.shared.SideBar

/**
 * Created by zach on 5/18/17.
 */
class MastersTab extends Page {
    static url = System.properties.'bolivar.url'
    static at = {
        //Wait for all the items on the left side bar
        waitFor(60,0.25) { side_bar.new_item.present }
        waitFor(10,0.01) { side_bar.people.present }
        waitFor(10,0.01) { side_bar.build_history.present }
        waitFor(10,0.01) { side_bar.edit_view.present }
        waitFor(10,0.01) { side_bar.manage_jenkins.present }
        waitFor(10,0.01) { side_bar.alerts.present }
        waitFor(10,0.01) { side_bar.support.present }
        waitFor(10,0.01) { side_bar.analytics_dashboard.present }
        waitFor(10,0.01) { side_bar.my_views.present }
        waitFor(10,0.01) { side_bar.credentials.present }
        //waitFor(10,0.01) { side_bar.cluster_operations.present }

        //wait for all the items in the header
        waitFor(60,0.1) { header.bread_crum_trail.present }
        waitFor(10,0.01) { header.jenkins_home.present }
        //waitFor(10,0.01) { header.active_alerts.present }
        waitFor(10,0.01) { header.search.present }
        waitFor(10,0.01) { header.search_help.present }
        waitFor(10,0.01) { header.user_profile.present }
        waitFor(10,0.01) { header.log_out.present }

        //Wait for all the items related to executors
        waitFor(60,0.1) { build_executors.status.present }
        waitFor(10,0.01) { build_queue.build_queue.present }
        waitFor(10,0.01) { build_queue.collapse_button.present }
        waitFor(10,0.01) { build_one.present }
        waitFor(10,0.01) { build_two.present }

        //This is new master button
        waitFor(60,0.01) { new_master_button.present }
        }

    static content = {
        side_bar { module SideBar }
        header { module Header }
        build_executors { module BuildExecutors }
        build_queue { module BuildQueue }
        build_one { module(new CurentBuildsInQueue(buildNumber:1)) }
        build_two { module(new CurentBuildsInQueue(buildNumber:2)) }
        tabs { module DefaultTabs }
        new_master_button { $('#yui-gen1-button') }
        //Note these only show up after new master button is clicked.
        new_master_textarea { $('#name')}
        new_master_label { $('#view-new-master > form > table > tbody > tr:nth-child(3) > td.settings-name')}
        //This button is behaving a bit oddly giving me different IDs when I run the test.
        //This seems to work and is stable.
        create_new_master_button { $('.settings-no-help') }
    }
}
