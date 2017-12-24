package com.starcolon.ml.domain

import org.apache.spark.sql.{Dataset, Row}
import org.apache.spark.sql.types.StructField

object StackOverflowTypes {

  case class Bio(
    respondent: Int, 
    professional: Option[String], 
    country: Option[String], 
    formaleducation: Option[String],
    race: Option[String], 
    university: Option[String],
    majorundergrad: Option[String])
  
  case class Job(
    respondent: Int,
    employmentstatus: Option[String], 
    companysize: Option[String], 
    companytype: Option[String], 
    yearscodedjob: Option[Int],
    developertype: Option[String],
    jobsatisfaction: Option[String],
    salary: Option[String],
    expectedsalary: Option[String])

  case class Personality(
    respondent: Int,
    learningnewtech: Option[String])

  val columns = Seq(
    "respondent",
    "professional",
    "programhobby",
    "country",
    "university",
    "employmentstatus",
    "formaleducation",
    "majorundergrad",
    "homeremote",
    "companysize",
    "companytype",
    "yearsprogram",
    "yearscodedjob",
    "yearscodedjobpast",
    "developertype",
    "webdevelopertype",
    "mobiledevelopertype",
    "nondevelopertype",
    "careersatisfaction",
    "jobsatisfaction",
    "excoderreturn",
    "excodernotforme",
    "excoderbalance",
    "excoder10years",
    "excoderbelonged",
    "excoderskills",
    "excoderwillnotcode",
    "excoderactive",
    "pronouncegif",
    "problemsolving",
    "buildingthings",
    "learningnewtech",
    "boringdetails",
    "jobsecurity",
    "diversityimportant",
    "annoyingui",
    "friendsdevelopers",
    "rightwrongway",
    "understandcomputers",
    "seriouswork",
    "investtimetools",
    "workpaycare",
    "kinshipdevelopers",
    "challengemyself",
    "competepeers",
    "changeworld",
    "jobseekingstatus",
    "hoursperweek",
    "lastnewjob",
    "assessjobindustry",
    "assessjobrole",
    "assessjobexp",
    "assessjobdept",
    "assessjobtech",
    "assessjobprojects",
    "assessjobcompensation",
    "assessjoboffice",
    "assessjobcommute",
    "assessjobremote",
    "assessjobleaders",
    "assessjobprofdevel",
    "assessjobdiversity",
    "assessjobproduct",
    "assessjobfinances",
    "importantbenefits",
    "clickykeys",
    "jobprofile",
    "resumeprompted",
    "learnedhiring",
    "importanthiringalgorithms",
    "importanthiringtechexp",
    "importanthiringcommunication",
    "importanthiringopensource",
    "importanthiringpmexp",
    "importanthiringcompanies",
    "importanthiringtitles",
    "importanthiringeducation",
    "importanthiringrep",
    "importanthiringgettingthingsdone",
    "currency",
    "overpaid",
    "tabsspaces",
    "educationimportant",
    "educationtypes",
    "selftaughttypes",
    "timeafterbootcamp",
    "cousineducation",
    "workstart",
    "haveworkedlanguage",
    "wantworklanguage",
    "haveworkedframework",
    "wantworkframework",
    "haveworkeddatabase",
    "wantworkdatabase",
    "haveworkedplatform",
    "wantworkplatform",
    "ide",
    "auditoryenvironment",
    "methodology",
    "versioncontrol",
    "checkincode",
    "shipit",
    "otherpeoplescode",
    "projectmanagement",
    "enjoydebugging",
    "inthezone",
    "difficultcommunication",
    "collaborateremote",
    "metricassess",
    "equipmentsatisfiedmonitors",
    "equipmentsatisfiedcpu",
    "equipmentsatisfiedram",
    "equipmentsatisfiedstorage",
    "equipmentsatisfiedrw",
    "influenceinternet",
    "influenceworkstation",
    "influencehardware",
    "influenceservers",
    "influencetechstack",
    "influencedepttech",
    "influenceviztools",
    "influencedatabase",
    "influencecloud",
    "influenceconsultants",
    "influencerecruitment",
    "influencecommunication",
    "stackoverflowdescribes",
    "stackoverflowsatisfaction",
    "stackoverflowdevices",
    "stackoverflowfoundanswer",
    "stackoverflowcopiedcode",
    "stackoverflowjoblisting",
    "stackoverflowcompanypage",
    "stackoverflowjobsearch",
    "stackoverflownewquestion",
    "stackoverflowanswer",
    "stackoverflowmetachat",
    "stackoverflowadsrelevant",
    "stackoverflowadsdistracting",
    "stackoverflowmoderation",
    "stackoverflowcommunity",
    "stackoverflowhelpful",
    "stackoverflowbetter",
    "stackoverflowwhatdo",
    "stackoverflowmakemoney",
    "gender",
    "highesteducationparents",
    "race",
    "surveylong",
    "questionsinteresting",
    "questionsconfusing",
    "interestedanswers",
    "salary",
    "expectedsalary"
  )
}