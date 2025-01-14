/*
 * Copyright 2023 HM Revenue & Customs
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package uk.gov.hmrc.hmrcemailrenderer.templates.hipp

import uk.gov.hmrc.hmrcemailrenderer.domain.{ MessagePriority, MessageTemplate }
import uk.gov.hmrc.hmrcemailrenderer.templates.FromAddress
import uk.gov.hmrc.hmrcemailrenderer.templates.ServiceIdentifier.Hipp

object HippTemplates {

  val templates = Seq(
    MessageTemplate.create(
      templateId = "hipp_add_team_member_to_app_email",
      fromAddress = FromAddress.noReply("Do not reply"),
      service = Hipp,
      subject = "You have been added to an application in The API Hub",
      plainTemplate = txt.AddTeamMember.f,
      htmlTemplate = html.AddTeamMember.f,
      priority = Some(MessagePriority.Urgent)
    ),
    MessageTemplate.create(
      templateId = "hipp_remove_team_member_from_app_email",
      fromAddress = FromAddress.noReply("Do not reply"),
      service = Hipp,
      subject = "You have been removed from an application in The API Hub",
      plainTemplate = txt.RemoveTeamMember.f,
      htmlTemplate = html.RemoveTeamMember.f,
      priority = Some(MessagePriority.Urgent)
    ),
    MessageTemplate.create(
      templateId = "hipp_application_created",
      fromAddress = FromAddress.noReply("Do not reply"),
      service = Hipp,
      subject = "You have created an application in The API Hub",
      plainTemplate = txt.ApplicationCreated.f,
      htmlTemplate = html.ApplicationCreated.f,
      priority = Some(MessagePriority.Urgent)
    ),
    MessageTemplate.create(
      templateId = "hipp_application_deleted",
      fromAddress = FromAddress.noReply("Do not reply"),
      service = Hipp,
      subject = "You have deleted an application from The API Hub",
      plainTemplate = txt.ApplicationDeleted.f,
      htmlTemplate = html.ApplicationDeleted.f,
      priority = Some(MessagePriority.Urgent)
    ),
    MessageTemplate.create(
      templateId = "hipp_application_deleted_team",
      fromAddress = FromAddress.noReply("Do not reply"),
      service = Hipp,
      subject = "Application deleted from The API Hub",
      plainTemplate = txt.ApplicationDeletedTeam.f,
      htmlTemplate = html.ApplicationDeletedTeam.f,
      priority = Some(MessagePriority.Urgent)
    )
  )
}
