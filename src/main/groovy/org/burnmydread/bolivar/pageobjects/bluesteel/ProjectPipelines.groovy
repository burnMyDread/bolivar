package org.burnmydread.bolivar.pageobjects.bluesteel

import geb.Page

class ProjectPipelines extends Page {
    static repo_name = System.properties.'bolivar.repo_name' ?: 'bolivar'
    static at = {
        waitFor(90,0.25) { team_link.present }
        waitFor(10,0.01) { pipeline_link.present }
        waitFor(10,0.01) { branches.present }
        waitFor(10,0.01) { prs.present }
    }
    static content = {
        team_link { $("#outer > section > div > div > h1 > span > a") }
        pipeline_link { $("#outer > section > div > div > h1 > a > span > ul > li > span.path-text")}
        activity { $("#outer > section > div > nav > a.activity") }
        branches { $("#outer > section > div > nav > a.branches") }
        prs { $("#outer > section > div > nav > a.pr")}
        passed_indicator_job_one { $("#${repo_name}-1 > td:nth-child(1) > a > div > svg > g > g > circle") }
    }
}
