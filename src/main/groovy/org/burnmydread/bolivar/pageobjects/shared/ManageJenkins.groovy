package org.burnmydread.bolivar.pageobjects.shared

import geb.Page

/**
 * Created by zach on 7/19/17.
 */
class ManageJenkins extends Page {
    static at = {
        waitFor(60,0.25) { configure_system.present }
        waitFor(10,0.01) { configure_security.present }
        waitFor(10,0.01) { configure_credentials.present }
        waitFor(10,0.01) { configure_analytics.present }
        waitFor(10,0.01) { global_tools.present }
        waitFor(10,0.01) { reload_configuration.present }
        waitFor(10,0.01) { manage_plugins.present }
        waitFor(10,0.01) { system_information.present }
        waitFor(10,0.01) { system_log.present }
        waitFor(10,0.01) { load_statistics.present }
        waitFor(10,0.01) { jenkins_cli.present }
        waitFor(10,0.01) { script_console.present }
        waitFor(10,0.01) { manage_nodes.present }
        waitFor(10,0.01) { castle_configuration.present }
        waitFor(10,0.01) { move_copy_promote.present }
        waitFor(10,0.01) { cluster_operations.present }
        waitFor(10,0.01) { about_jenkins.present }
        waitFor(10,0.01) { manage_old_data.present }
        waitFor(10,0.01) { manage_license.present }
        waitFor(10,0.01) { manage_users.present }
        waitFor(10,0.01) { script_approval.present }
        waitFor(10,0.01) { prepare_for_shutdown.present }

    }
    static content = {
        configure_system       { $('#management-links > tbody > tr:nth-child(1) > td:nth-child(2) > div.link > a')  }
        configure_security     { $('#management-links > tbody > tr:nth-child(2) > td:nth-child(2) > div.link > a')  }
        configure_credentials  { $('#management-links > tbody > tr:nth-child(3) > td:nth-child(2) > div.link > a')  }
        configure_analytics    { $('#management-links > tbody > tr:nth-child(4) > td:nth-child(2) > div.link > a')  }
        global_tools           { $('#management-links > tbody > tr:nth-child(5) > td:nth-child(2) > div.link > a')  }
        reload_configuration   { $('#management-links > tbody > tr:nth-child(6) > td:nth-child(2) > div.link > a')  }
        manage_plugins         { $('#management-links > tbody > tr:nth-child(7) > td:nth-child(2) > div.link > a')  }
        system_information     { $('#management-links > tbody > tr:nth-child(8) > td:nth-child(2) > div.link > a')  }
        system_log             { $('#management-links > tbody > tr:nth-child(9) > td:nth-child(2) > div.link > a')  }
        load_statistics        { $('#management-links > tbody > tr:nth-child(10) > td:nth-child(2) > div.link > a') }
        jenkins_cli            { $('#management-links > tbody > tr:nth-child(11) > td:nth-child(2) > div.link > a') }
        script_console         { $('#management-links > tbody > tr:nth-child(12) > td:nth-child(2) > div.link > a') }
        manage_nodes           { $('#management-links > tbody > tr:nth-child(13) > td:nth-child(2) > div.link > a') }
        castle_configuration   { $('#management-links > tbody > tr:nth-child(14) > td:nth-child(2) > div.link > a') }
        move_copy_promote      { $('#management-links > tbody > tr:nth-child(15) > td:nth-child(2) > div.link > a') }
        cluster_operations     { $('#management-links > tbody > tr:nth-child(16) > td:nth-child(2) > div.link > a') }
        about_jenkins          { $('#management-links > tbody > tr:nth-child(17) > td:nth-child(2) > div.link > a') }
        manage_old_data        { $('#management-links > tbody > tr:nth-child(18) > td:nth-child(2) > div.link > a') }
        manage_license         { $('#management-links > tbody > tr:nth-child(19) > td:nth-child(2) > div.link > a') }
        manage_users           { $('#management-links > tbody > tr:nth-child(20) > td:nth-child(2) > div.link > a') }
        script_approval        { $('#management-links > tbody > tr:nth-child(21) > td:nth-child(2) > div.link > a') }
        prepare_for_shutdown   { $('#management-links > tbody > tr:nth-child(22) > td:nth-child(2) > div.link > a') }
    }
}
