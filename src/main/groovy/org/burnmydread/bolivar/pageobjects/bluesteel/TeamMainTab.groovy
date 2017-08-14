package org.burnmydread.bolivar.pageobjects.bluesteel

import geb.Page
import org.burnmydread.bolivar.pageobjects.DefaultTabs
import org.burnmydread.bolivar.pageobjects.shared.BuildExecutors
import org.burnmydread.bolivar.pageobjects.shared.BuildQueue
import org.burnmydread.bolivar.pageobjects.shared.CurentBuildsInQueue
import org.burnmydread.bolivar.pageobjects.shared.Header
import org.burnmydread.bolivar.pageobjects.shared.SideBar

class TeamMainTab extends Page {

    static at = {
        //Wait for all the items on the left side bar
        waitFor(60,0.25) { side_bar.new_item.present }
        waitFor(10,0.01) { side_bar.people.present }
        waitFor(10,0.01) { side_bar.build_history.present }
        waitFor(10,0.01) { side_bar.manage_jenkins.present }
        waitFor(10,0.01) { side_bar.alerts.present }
        waitFor(10,0.01) { side_bar.support.present }
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

    }

    static content = {
        side_bar { module SideBar }
        header { module Header }
        build_executors { module BuildExecutors }
        build_queue { module BuildQueue }
        build_one { module(new CurentBuildsInQueue(buildNumber:1)) }
        build_two { module(new CurentBuildsInQueue(buildNumber:2)) }
        tabs { module DefaultTabs }

    }
}
