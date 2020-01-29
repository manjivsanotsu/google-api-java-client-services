/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
/*
 * This code was generated by https://github.com/googleapis/google-api-java-client-services/
 * Modify at your own risk.
 */

package com.google.api.services.run.v1alpha1.model;

/**
 * The desired state of the CloudAuditLog.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Run API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class CloudAuditLogSpec extends com.google.api.client.json.GenericJson {

  /**
   * CloudEventOverrides defines overrides to control the output format and modifications of the
   * event sent to the sink. +optional
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private CloudEventOverrides ceOverrides;

  /**
   * Required. The method name at the service API. This must match "methodName" in Cloud Audit Logs.
   * Regex or Wildcards (*) are not supported. Example: "google.cloud.bigquery.job.create".
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String methodName;

  /**
   * Project is the ID of the Google Cloud Project that the PubSub Topic exists in. If omitted,
   * defaults to same as the cluster. +optional
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String project;

  /**
   * PubSubSecret is the credential to use to create Topic / PullSubscription resources. If omitted,
   * uses Secret.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private SecretKeySelector pubsubSecret;

  /**
   * Optional. The resource specification. This must match "methodName" in Cloud Audit Logs. Regex
   * or Wildcards (*) are not supported. Example: "projects/my-project/jobs/foo".
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String resourceName;

  /**
   * Secret is the credential to use to create the Scheduler Job. If not specified, defaults to:
   * Name: google-cloud-key Key: key.json +optional
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private SecretKeySelector secret;

  /**
   * Email address of the IAM service account associated with the source. The service account
   * represents the identity of the source, and determines what permissions the source has. If not
   * provided, the source will use the project's default service account. +optional
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String serviceAccountName;

  /**
   * Required. The GCP service name. This must match "serviceName" in Cloud Audit Logs. Regex or
   * Wildcards (*) are not supported. Example: "bigquery.googleapis.com".
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String serviceName;

  /**
   * Sink is a reference to an object that will resolve to a domain name or a URI directly to use as
   * the sink.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Destination sink;

  /**
   * CloudEventOverrides defines overrides to control the output format and modifications of the
   * event sent to the sink. +optional
   * @return value or {@code null} for none
   */
  public CloudEventOverrides getCeOverrides() {
    return ceOverrides;
  }

  /**
   * CloudEventOverrides defines overrides to control the output format and modifications of the
   * event sent to the sink. +optional
   * @param ceOverrides ceOverrides or {@code null} for none
   */
  public CloudAuditLogSpec setCeOverrides(CloudEventOverrides ceOverrides) {
    this.ceOverrides = ceOverrides;
    return this;
  }

  /**
   * Required. The method name at the service API. This must match "methodName" in Cloud Audit Logs.
   * Regex or Wildcards (*) are not supported. Example: "google.cloud.bigquery.job.create".
   * @return value or {@code null} for none
   */
  public java.lang.String getMethodName() {
    return methodName;
  }

  /**
   * Required. The method name at the service API. This must match "methodName" in Cloud Audit Logs.
   * Regex or Wildcards (*) are not supported. Example: "google.cloud.bigquery.job.create".
   * @param methodName methodName or {@code null} for none
   */
  public CloudAuditLogSpec setMethodName(java.lang.String methodName) {
    this.methodName = methodName;
    return this;
  }

  /**
   * Project is the ID of the Google Cloud Project that the PubSub Topic exists in. If omitted,
   * defaults to same as the cluster. +optional
   * @return value or {@code null} for none
   */
  public java.lang.String getProject() {
    return project;
  }

  /**
   * Project is the ID of the Google Cloud Project that the PubSub Topic exists in. If omitted,
   * defaults to same as the cluster. +optional
   * @param project project or {@code null} for none
   */
  public CloudAuditLogSpec setProject(java.lang.String project) {
    this.project = project;
    return this;
  }

  /**
   * PubSubSecret is the credential to use to create Topic / PullSubscription resources. If omitted,
   * uses Secret.
   * @return value or {@code null} for none
   */
  public SecretKeySelector getPubsubSecret() {
    return pubsubSecret;
  }

  /**
   * PubSubSecret is the credential to use to create Topic / PullSubscription resources. If omitted,
   * uses Secret.
   * @param pubsubSecret pubsubSecret or {@code null} for none
   */
  public CloudAuditLogSpec setPubsubSecret(SecretKeySelector pubsubSecret) {
    this.pubsubSecret = pubsubSecret;
    return this;
  }

  /**
   * Optional. The resource specification. This must match "methodName" in Cloud Audit Logs. Regex
   * or Wildcards (*) are not supported. Example: "projects/my-project/jobs/foo".
   * @return value or {@code null} for none
   */
  public java.lang.String getResourceName() {
    return resourceName;
  }

  /**
   * Optional. The resource specification. This must match "methodName" in Cloud Audit Logs. Regex
   * or Wildcards (*) are not supported. Example: "projects/my-project/jobs/foo".
   * @param resourceName resourceName or {@code null} for none
   */
  public CloudAuditLogSpec setResourceName(java.lang.String resourceName) {
    this.resourceName = resourceName;
    return this;
  }

  /**
   * Secret is the credential to use to create the Scheduler Job. If not specified, defaults to:
   * Name: google-cloud-key Key: key.json +optional
   * @return value or {@code null} for none
   */
  public SecretKeySelector getSecret() {
    return secret;
  }

  /**
   * Secret is the credential to use to create the Scheduler Job. If not specified, defaults to:
   * Name: google-cloud-key Key: key.json +optional
   * @param secret secret or {@code null} for none
   */
  public CloudAuditLogSpec setSecret(SecretKeySelector secret) {
    this.secret = secret;
    return this;
  }

  /**
   * Email address of the IAM service account associated with the source. The service account
   * represents the identity of the source, and determines what permissions the source has. If not
   * provided, the source will use the project's default service account. +optional
   * @return value or {@code null} for none
   */
  public java.lang.String getServiceAccountName() {
    return serviceAccountName;
  }

  /**
   * Email address of the IAM service account associated with the source. The service account
   * represents the identity of the source, and determines what permissions the source has. If not
   * provided, the source will use the project's default service account. +optional
   * @param serviceAccountName serviceAccountName or {@code null} for none
   */
  public CloudAuditLogSpec setServiceAccountName(java.lang.String serviceAccountName) {
    this.serviceAccountName = serviceAccountName;
    return this;
  }

  /**
   * Required. The GCP service name. This must match "serviceName" in Cloud Audit Logs. Regex or
   * Wildcards (*) are not supported. Example: "bigquery.googleapis.com".
   * @return value or {@code null} for none
   */
  public java.lang.String getServiceName() {
    return serviceName;
  }

  /**
   * Required. The GCP service name. This must match "serviceName" in Cloud Audit Logs. Regex or
   * Wildcards (*) are not supported. Example: "bigquery.googleapis.com".
   * @param serviceName serviceName or {@code null} for none
   */
  public CloudAuditLogSpec setServiceName(java.lang.String serviceName) {
    this.serviceName = serviceName;
    return this;
  }

  /**
   * Sink is a reference to an object that will resolve to a domain name or a URI directly to use as
   * the sink.
   * @return value or {@code null} for none
   */
  public Destination getSink() {
    return sink;
  }

  /**
   * Sink is a reference to an object that will resolve to a domain name or a URI directly to use as
   * the sink.
   * @param sink sink or {@code null} for none
   */
  public CloudAuditLogSpec setSink(Destination sink) {
    this.sink = sink;
    return this;
  }

  @Override
  public CloudAuditLogSpec set(String fieldName, Object value) {
    return (CloudAuditLogSpec) super.set(fieldName, value);
  }

  @Override
  public CloudAuditLogSpec clone() {
    return (CloudAuditLogSpec) super.clone();
  }

}
