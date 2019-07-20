/*
 * Copyright 2016 ThoughtWorks, Inc.
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

package cd.go.contrib.elasticagents.openstack;


import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.joda.time.Period;

public class PluginSettings {
    public static final Gson GSON = new GsonBuilder()
            .setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
            .excludeFieldsWithoutExposeAnnotation()
            .create();

    @Expose
    @SerializedName("go_server_url")
    private String goServerUrl;

    @Expose
    @SerializedName("openstack_endpoint")
    private String openstackEndpoint;

    @Expose
    @SerializedName("openstack_keystone_version")
    private String openstackKeystoneVersion;

    @Expose
    @SerializedName("openstack_domain")
    private String openstackDomain;

    @Expose
    @SerializedName("agent_pending_register_timeout")
    private String agentPendingRegisterTimeout;

    @Expose
    @SerializedName("auto_register_timeout")
    private String agentTTLMin;

    @Expose
    @SerializedName("agent_ttl_max")
    private String agentTTLMax;

    @Expose
    @SerializedName("default_min_instance_limit")
    private String defaultMinInstanceLimit;

    @Expose
    @SerializedName("default_max_instance_limit")
    private String defaultMaxInstanceLimit;

    @Expose
    @SerializedName("openstack_tenant")
    private String openstackTenant;

    @Expose
    @SerializedName("openstack_user")
    private String openstackUser;

    @Expose
    @SerializedName("openstack_password")
    private String openstackPassword;

    @Expose
    @SerializedName("openstack_vm_prefix")
    private String openstackVmPrefix;

    @Expose
    @SerializedName("openstack_image")
    private String openstackImage;

    @Expose
    @SerializedName("openstack_image_cache_ttl")
    private String openstackImageCacheTTL;

    @Expose
    @SerializedName("use_previous_openstack_image")
    private Boolean usePreviousOpenstackImage;

    @Expose
    @SerializedName("openstack_flavor")
    private String openstackFlavor;

    @Expose
    @SerializedName("openstack_network")
    private String openstackNetwork;

    @Expose
    @SerializedName("openstack_userdata")
    private String openstackUserdata;
    
    @Expose
    @SerializedName("ssl_verification_disabled")
    private Boolean sslVerificationDisabled;

    @Expose
    @SerializedName("delete_error_instances")
    private Boolean deleteErrorInstances;

    private Period agentRegisterPeriod;
    private Period agentTTLMinPeriod;

    public static PluginSettings fromJSON(String json) {
        return GSON.fromJson(json, PluginSettings.class);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PluginSettings that = (PluginSettings) o;

        if (goServerUrl != null ? !goServerUrl.equals(that.goServerUrl) : that.goServerUrl != null) return false;
        if (openstackEndpoint != null ? !openstackEndpoint.equals(that.openstackEndpoint) : that.openstackEndpoint != null)
            return false;
        if (openstackKeystoneVersion != null ? !openstackKeystoneVersion.equals(that.openstackKeystoneVersion) : that.openstackKeystoneVersion != null)
            return false;
        if (agentTTLMin != null ? !agentTTLMin.equals(that.agentTTLMin) : that.agentTTLMin != null)
            return false;
        if (agentTTLMax != null ? !agentTTLMax.equals(that.agentTTLMax) : that.agentTTLMax != null)
            return false;
        if (openstackDomain != null ? !openstackDomain.equals(that.openstackDomain) : that.openstackDomain != null)
            return false;
        if (defaultMinInstanceLimit != null ? !defaultMinInstanceLimit.equals(that.defaultMinInstanceLimit) : that.defaultMinInstanceLimit != null)
            return false;
        if (defaultMaxInstanceLimit != null ? !defaultMaxInstanceLimit.equals(that.defaultMaxInstanceLimit) : that.defaultMaxInstanceLimit != null)
            return false;
        if (openstackTenant != null ? !openstackTenant.equals(that.openstackTenant) : that.openstackTenant != null)
            return false;
        if (openstackUser != null ? !openstackUser.equals(that.openstackUser) : that.openstackUser != null)
            return false;
        if (openstackPassword != null ? !openstackPassword.equals(that.openstackPassword) : that.openstackPassword != null)
            return false;
        if (openstackVmPrefix != null ? !openstackVmPrefix.equals(that.openstackVmPrefix) : that.openstackVmPrefix != null)
            return false;
        if (openstackImage != null ? !openstackImage.equals(that.openstackImage) : that.openstackImage != null)
            return false;
        if (openstackImageCacheTTL != null ? !openstackImageCacheTTL.equals(that.openstackImageCacheTTL) : that.openstackImageCacheTTL != null)
            return false;
        if (openstackFlavor != null ? !openstackFlavor.equals(that.openstackFlavor) : that.openstackFlavor != null)
            return false;
        if (openstackNetwork != null ? !openstackNetwork.equals(that.openstackNetwork) : that.openstackNetwork != null)
            return false;
        if (deleteErrorInstances != that.deleteErrorInstances)
            return false;
        return openstackUserdata != null ? openstackUserdata.equals(that.openstackUserdata) : that.openstackUserdata == null;

    }

    @Override
    public int hashCode() {
        int result = goServerUrl != null ? goServerUrl.hashCode() : 0;
        result = 31 * result + (openstackEndpoint != null ? openstackEndpoint.hashCode() : 0);
        result = 31 * result + (openstackKeystoneVersion != null ? openstackKeystoneVersion.hashCode() : 0);
        result = 31 * result + (agentPendingRegisterTimeout != null ? agentPendingRegisterTimeout.hashCode() : 0);
        result = 31 * result + (agentTTLMin != null ? agentTTLMin.hashCode() : 0);
        result = 31 * result + (agentTTLMax != null ? agentTTLMax.hashCode() : 0);
        result = 31 * result + (openstackDomain != null ? openstackDomain.hashCode() : 0);
        result = 31 * result + (defaultMinInstanceLimit != null ? defaultMinInstanceLimit.hashCode() : 0);
        result = 31 * result + (defaultMaxInstanceLimit != null ? defaultMaxInstanceLimit.hashCode() : 0);
        result = 31 * result + (openstackTenant != null ? openstackTenant.hashCode() : 0);
        result = 31 * result + (openstackUser != null ? openstackUser.hashCode() : 0);
        result = 31 * result + (openstackPassword != null ? openstackPassword.hashCode() : 0);
        result = 31 * result + (openstackVmPrefix != null ? openstackVmPrefix.hashCode() : 0);
        result = 31 * result + (openstackImage != null ? openstackImage.hashCode() : 0);
        result = 31 * result + (openstackImageCacheTTL != null ? openstackImageCacheTTL.hashCode() : 0);
        result = 31 * result + (openstackFlavor != null ? openstackFlavor.hashCode() : 0);
        result = 31 * result + (openstackNetwork != null ? openstackNetwork.hashCode() : 0);
        result = 31 * result + (openstackUserdata != null ? openstackUserdata.hashCode() : 0);
        return result;
    }

    public Period getAgentPendingRegisterPeriod() {
        if (this.agentRegisterPeriod == null) {
            this.agentRegisterPeriod = new Period().withMinutes(Integer.parseInt(getAgentPendingRegisterTimeout()));
        }
        return this.agentRegisterPeriod;
    }

    private String getAgentPendingRegisterTimeout() {
        if (agentPendingRegisterTimeout == null) {
            agentPendingRegisterTimeout = "10";
        }
        return agentPendingRegisterTimeout;
    }

    public void setAgentPendingRegisterTimeout(String agentPendingRegisterTimeout) {
        this.agentPendingRegisterTimeout = agentPendingRegisterTimeout;
    }

    public Period getAgentTTLMinPeriod() {
        if (this.agentTTLMinPeriod == null) {
            this.agentTTLMinPeriod = new Period().withMinutes(Integer.parseInt(getAgentTTLMin()));
        }
        return this.agentTTLMinPeriod;
    }

    private String getAgentTTLMin() {
        if (agentTTLMin == null) {
            agentTTLMin = "10";
        }
        return agentTTLMin;
    }

    public void setAgentTTLMin(String agentTTLMin) {
        this.agentTTLMin = agentTTLMin;
    }

    public String getDefaultMinInstanceLimit() {
        if (defaultMinInstanceLimit == null) {
            defaultMinInstanceLimit = "1";
        }
        return defaultMinInstanceLimit;
    }

    public int getAgentTTLMax() {
        int result;
        try {
            result = Integer.parseInt(agentTTLMax);
        } catch (NumberFormatException nfe) {
            result = 0;
        }
        return result;
    }

    public void setAgentTTLMax(String agentTTLMax) {
        this.agentTTLMax = agentTTLMax;
    }

    public String getDefaultMaxInstanceLimit() {
        if (defaultMaxInstanceLimit == null) {
            defaultMaxInstanceLimit = "10";
        }
        return defaultMaxInstanceLimit;
    }

    public String getGoServerUrl() {
        return goServerUrl;
    }

    public void setGoServerUrl(String goServerUrl) {
        this.goServerUrl = goServerUrl;
    }

    public String getOpenstackEndpoint() {
        return openstackEndpoint;
    }

    public String getOpenstackKeystoneVersion() {
        openstackKeystoneVersion = (openstackKeystoneVersion == null) ? "2" : openstackKeystoneVersion;
        return openstackKeystoneVersion;
    }

    public String getOpenstackTenant() {
        return openstackTenant;
    }

    public String getOpenstackDomain() {
        openstackDomain = (openstackDomain == null) ? "Default" : openstackDomain;
        return openstackDomain;
    }

    public String getOpenstackUser() {
        return openstackUser;
    }

    public String getOpenstackPassword() {
        return openstackPassword;
    }

    public String getOpenstackVmPrefix() {
        return openstackVmPrefix;
    }

    public String getOpenstackImage() {
        return openstackImage;
    }

    public String getOpenstackImageCacheTTL() {
        return openstackImageCacheTTL;
    }

    public Boolean getUsePreviousOpenstackImage() {
        return usePreviousOpenstackImage;
    }

    public String getOpenstackFlavor() {
        return openstackFlavor;
    }

    public String getOpenstackNetwork() {
        return openstackNetwork;
    }

    public String getOpenstackUserdata() {
        return openstackUserdata;
    }

    public Boolean getSSLVerificationDisabled() {
        return sslVerificationDisabled;
    }
    
    public void setOpenstackEndpoint(String openstackEndpoint) {
        this.openstackEndpoint = openstackEndpoint;
    }

    public void setOpenstackKeystoneVersion(String openstackKeystoneVersion) {
        this.openstackKeystoneVersion = openstackKeystoneVersion;
    }

    public void setOpenstackDomain(String openstackDomain) {
        this.openstackDomain = openstackDomain;
    }

    public void setOpenstackTenant(String openstackTenant) {
        this.openstackTenant = openstackTenant;
    }

    public void setOpenstackUser(String openstackUser) {
        this.openstackUser = openstackUser;
    }

    public void setOpenstackPassword(String openstackPassword) {
        this.openstackPassword = openstackPassword;
    }

    public void setOpenstackVmPrefix(String openstackVmPrefix) {
        this.openstackVmPrefix = openstackVmPrefix;
    }

    public void setOpenstackImage(String openstackImage) {
        this.openstackImage = openstackImage;
    }

    public void setOpenstackImageCacheTTL(String openstackImageCacheTTL) {
        this.openstackImageCacheTTL = openstackImageCacheTTL;
    }

    public void setUsePreviousOpenstackImage(Boolean usePreviousOpenstackImage) {
        this.usePreviousOpenstackImage = usePreviousOpenstackImage;
    }

    public void setOpenstackFlavor(String openstackFlavor) {
        this.openstackFlavor = openstackFlavor;
    }

    public void setOpenstackNetwork(String openstackNetwork) {
        this.openstackNetwork = openstackNetwork;
    }

    public void setOpenstackUserdata(String openstackUserdata) {
        this.openstackUserdata = openstackUserdata;
    }
    
    public void setSSLVerificationDisabled(Boolean sslVerificationDisabled) {
        this.sslVerificationDisabled = sslVerificationDisabled;
    }

    public Boolean getOpenstackDeleteErrorInstances() {
        if(deleteErrorInstances == null)
            return false;
        return deleteErrorInstances;
    }

    public void setDeleteErrorInstances(boolean deleteErrorInstances) {
        this.deleteErrorInstances = deleteErrorInstances;
    }

    @Override
    public String toString() {
        return "PluginSettings{" +
                "goServerUrl='" + goServerUrl + '\'' +
                ", openstackEndpoint='" + openstackEndpoint + '\'' +
                ", openstackKeystoneVersion='" + openstackKeystoneVersion + '\'' +
                ", openstackDomain='" + openstackDomain + '\'' +
                ", agentPendingRegisterTimeout='" + agentPendingRegisterTimeout + '\'' +
                ", agentTTLMin='" + agentTTLMin + '\'' +
                ", agentTTLMax='" + agentTTLMax + '\'' +
                ", defaultMinInstanceLimit='" + defaultMinInstanceLimit + '\'' +
                ", defaultMaxInstanceLimit='" + defaultMaxInstanceLimit + '\'' +
                ", openstackTenant='" + openstackTenant + '\'' +
                ", openstackUser='" + openstackUser + '\'' +
                ", openstackPassword='" + openstackPassword + '\'' +
                ", openstackVmPrefix='" + openstackVmPrefix + '\'' +
                ", openstackImage='" + openstackImage + '\'' +
                ", openstackImageCacheTTL='" + openstackImageCacheTTL + '\'' +
                ", usePreviousOpenstackImage=" + usePreviousOpenstackImage +
                ", openstackFlavor='" + openstackFlavor + '\'' +
                ", openstackNetwork='" + openstackNetwork + '\'' +
                ", openstackUserdata='" + openstackUserdata + '\'' +
                ", sslVerificationDisabled=" + sslVerificationDisabled +
                ", deleteErrorInstances=" + deleteErrorInstances +
                ", agentRegisterPeriod=" + agentRegisterPeriod +
                ", agentTTLMinPeriod=" + agentTTLMinPeriod +
                '}';
    }
}
