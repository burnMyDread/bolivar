package org.burnmydread.bolivar.pageobjects.bluesteel

import geb.Page

/**
 * Created by zach on 8/12/17.
 */
class BlueSteelTeamPipelines extends Page {
    static at = {
        waitFor(60, 0.25) { team_name.present }
        waitFor(10, 0.1) { cloudbees_logo.present }
        waitFor(10, 0.1) { pipelines.present }
        waitFor(10, 0.1) { admin.present }
        waitFor(10, 0.1) { new_pipeline.present }

    }
    static content = {
        team_name { $('#outer > section > div > div > div.u-flex-grow > div.ExtensionPoint.jenkins-pipeline-header > div > h1 > span')}
        cloudbees_logo { $('#root > div > section > div > div > div.ExtensionPoint.jenkins-header-logo > div > a') }
        pipelines { $('#root > div > section > div > div > nav > div.ExtensionPoint.jenkins-blueocean-top-pipelines > a') }
        admin { $('#root > div > section > div > div > nav > div.ExtensionPoint.jenkins-blueocean-top-admin > div > a') }
        new_pipeline { $('#outer > section > div > div > div.ExtensionPoint.jenkins-pipeline-create-action > a') }
    }
}
