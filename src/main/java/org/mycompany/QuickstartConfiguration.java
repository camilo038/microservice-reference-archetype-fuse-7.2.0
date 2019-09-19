/**
 *  Copyright 2005-2016 Red Hat, Inc.
 *
 *  Red Hat licenses this file to you under the Apache License, version
 *  2.0 (the "License"); you may not use this file except in compliance
 *  with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or
 *  implied.  See the License for the specific language governing
 *  permissions and limitations under the License.
 */
package org.mycompany;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "quickstart")
public class QuickstartConfiguration {

    /**
     * A comma-separated list of routes to use as recipients for messages.
     */
    private String recipients;

    /**
     * The username to use when connecting to the async queue (simulation)
     */
    private String queueUsername;

    public String getPasswordb() {
		return passwordb;
	}

	public void setPasswordb(String passwordb) {
		this.passwordb = passwordb;
	}

	private String  passwordb;
    /**
     * The password to use when connecting to the async queue (simulation)
     */
    private String queuePassword;
    
    public String getQueuePassword() {
		return queuePassword;
	}

	public void setQueuePassword(String queuePassword) {
		this.queuePassword = queuePassword;
	}

	private String recipientu;
    
    private String  url;
    

    public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getRecipientu() {
		return recipientu;
	}

	public void setRecipientu(String recipientu) {
		this.recipientu = recipientu;
	}

	public String getRecipients() {
        return recipients;
    }

    public void setRecipients(String recipients) {
        this.recipients = recipients;
    }

    public String getQueueUsername() {
        return queueUsername;
    }

    public void setQueueUsername(String queueUsername) {
        this.queueUsername = queueUsername;
    }


}
