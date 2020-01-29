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

package com.google.api.services.compute.model;

/**
 * Represents a Health Check resource.
 *
 * Google Compute Engine has two Health Check resources:
 *
 * * [Global](/compute/docs/reference/rest/latest/healthChecks) *
 * [Regional](/compute/docs/reference/rest/latest/regionHealthChecks)
 *
 * Internal HTTP(S) load balancers use regional health checks. All other types of GCP load balancers
 * and managed instance group auto-healing use global health checks. For more information, read
 * Health Check Concepts.
 *
 * To perform health checks on network load balancers, you must use either httpHealthChecks or
 * httpsHealthChecks.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Compute Engine API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class HealthCheck extends com.google.api.client.json.GenericJson {

  /**
   * How often (in seconds) to send a health check. The default value is 5 seconds.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer checkIntervalSec;

  /**
   * [Output Only] Creation timestamp in 3339 text format.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String creationTimestamp;

  /**
   * An optional description of this resource. Provide this property when you create the resource.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String description;

  /**
   * A so-far unhealthy instance will be marked healthy after this many consecutive successes. The
   * default value is 2.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer healthyThreshold;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private HTTP2HealthCheck http2HealthCheck;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private HTTPHealthCheck httpHealthCheck;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private HTTPSHealthCheck httpsHealthCheck;

  /**
   * [Output Only] The unique identifier for the resource. This identifier is defined by the server.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.math.BigInteger id;

  /**
   * Type of the resource.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kind;

  /**
   * Configure logging on this health check.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private HealthCheckLogConfig logConfig;

  /**
   * Name of the resource. Provided by the client when the resource is created. The name must be
   * 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters
   * long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first
   * character must be a lowercase letter, and all following characters must be a dash, lowercase
   * letter, or digit, except the last character, which cannot be a dash.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * [Output Only] Region where the health check resides. Not applicable to global health checks.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String region;

  /**
   * [Output Only] Server-defined URL for the resource.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String selfLink;

  /**
   * [Output Only] Server-defined URL for this resource with the resource id.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String selfLinkWithId;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private SSLHealthCheck sslHealthCheck;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private TCPHealthCheck tcpHealthCheck;

  /**
   * How long (in seconds) to wait before claiming failure. The default value is 5 seconds. It is
   * invalid for timeoutSec to have greater value than checkIntervalSec.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer timeoutSec;

  /**
   * Specifies the type of the healthCheck, either TCP, SSL, HTTP, HTTPS or HTTP2. If not specified,
   * the default is TCP. Exactly one of the protocol-specific health check field must be specified,
   * which must match type field.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String type;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private UDPHealthCheck udpHealthCheck;

  /**
   * A so-far healthy instance will be marked unhealthy after this many consecutive failures. The
   * default value is 2.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer unhealthyThreshold;

  /**
   * How often (in seconds) to send a health check. The default value is 5 seconds.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getCheckIntervalSec() {
    return checkIntervalSec;
  }

  /**
   * How often (in seconds) to send a health check. The default value is 5 seconds.
   * @param checkIntervalSec checkIntervalSec or {@code null} for none
   */
  public HealthCheck setCheckIntervalSec(java.lang.Integer checkIntervalSec) {
    this.checkIntervalSec = checkIntervalSec;
    return this;
  }

  /**
   * [Output Only] Creation timestamp in 3339 text format.
   * @return value or {@code null} for none
   */
  public java.lang.String getCreationTimestamp() {
    return creationTimestamp;
  }

  /**
   * [Output Only] Creation timestamp in 3339 text format.
   * @param creationTimestamp creationTimestamp or {@code null} for none
   */
  public HealthCheck setCreationTimestamp(java.lang.String creationTimestamp) {
    this.creationTimestamp = creationTimestamp;
    return this;
  }

  /**
   * An optional description of this resource. Provide this property when you create the resource.
   * @return value or {@code null} for none
   */
  public java.lang.String getDescription() {
    return description;
  }

  /**
   * An optional description of this resource. Provide this property when you create the resource.
   * @param description description or {@code null} for none
   */
  public HealthCheck setDescription(java.lang.String description) {
    this.description = description;
    return this;
  }

  /**
   * A so-far unhealthy instance will be marked healthy after this many consecutive successes. The
   * default value is 2.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getHealthyThreshold() {
    return healthyThreshold;
  }

  /**
   * A so-far unhealthy instance will be marked healthy after this many consecutive successes. The
   * default value is 2.
   * @param healthyThreshold healthyThreshold or {@code null} for none
   */
  public HealthCheck setHealthyThreshold(java.lang.Integer healthyThreshold) {
    this.healthyThreshold = healthyThreshold;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public HTTP2HealthCheck getHttp2HealthCheck() {
    return http2HealthCheck;
  }

  /**
   * @param http2HealthCheck http2HealthCheck or {@code null} for none
   */
  public HealthCheck setHttp2HealthCheck(HTTP2HealthCheck http2HealthCheck) {
    this.http2HealthCheck = http2HealthCheck;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public HTTPHealthCheck getHttpHealthCheck() {
    return httpHealthCheck;
  }

  /**
   * @param httpHealthCheck httpHealthCheck or {@code null} for none
   */
  public HealthCheck setHttpHealthCheck(HTTPHealthCheck httpHealthCheck) {
    this.httpHealthCheck = httpHealthCheck;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public HTTPSHealthCheck getHttpsHealthCheck() {
    return httpsHealthCheck;
  }

  /**
   * @param httpsHealthCheck httpsHealthCheck or {@code null} for none
   */
  public HealthCheck setHttpsHealthCheck(HTTPSHealthCheck httpsHealthCheck) {
    this.httpsHealthCheck = httpsHealthCheck;
    return this;
  }

  /**
   * [Output Only] The unique identifier for the resource. This identifier is defined by the server.
   * @return value or {@code null} for none
   */
  public java.math.BigInteger getId() {
    return id;
  }

  /**
   * [Output Only] The unique identifier for the resource. This identifier is defined by the server.
   * @param id id or {@code null} for none
   */
  public HealthCheck setId(java.math.BigInteger id) {
    this.id = id;
    return this;
  }

  /**
   * Type of the resource.
   * @return value or {@code null} for none
   */
  public java.lang.String getKind() {
    return kind;
  }

  /**
   * Type of the resource.
   * @param kind kind or {@code null} for none
   */
  public HealthCheck setKind(java.lang.String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * Configure logging on this health check.
   * @return value or {@code null} for none
   */
  public HealthCheckLogConfig getLogConfig() {
    return logConfig;
  }

  /**
   * Configure logging on this health check.
   * @param logConfig logConfig or {@code null} for none
   */
  public HealthCheck setLogConfig(HealthCheckLogConfig logConfig) {
    this.logConfig = logConfig;
    return this;
  }

  /**
   * Name of the resource. Provided by the client when the resource is created. The name must be
   * 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters
   * long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first
   * character must be a lowercase letter, and all following characters must be a dash, lowercase
   * letter, or digit, except the last character, which cannot be a dash.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Name of the resource. Provided by the client when the resource is created. The name must be
   * 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters
   * long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first
   * character must be a lowercase letter, and all following characters must be a dash, lowercase
   * letter, or digit, except the last character, which cannot be a dash.
   * @param name name or {@code null} for none
   */
  public HealthCheck setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * [Output Only] Region where the health check resides. Not applicable to global health checks.
   * @return value or {@code null} for none
   */
  public java.lang.String getRegion() {
    return region;
  }

  /**
   * [Output Only] Region where the health check resides. Not applicable to global health checks.
   * @param region region or {@code null} for none
   */
  public HealthCheck setRegion(java.lang.String region) {
    this.region = region;
    return this;
  }

  /**
   * [Output Only] Server-defined URL for the resource.
   * @return value or {@code null} for none
   */
  public java.lang.String getSelfLink() {
    return selfLink;
  }

  /**
   * [Output Only] Server-defined URL for the resource.
   * @param selfLink selfLink or {@code null} for none
   */
  public HealthCheck setSelfLink(java.lang.String selfLink) {
    this.selfLink = selfLink;
    return this;
  }

  /**
   * [Output Only] Server-defined URL for this resource with the resource id.
   * @return value or {@code null} for none
   */
  public java.lang.String getSelfLinkWithId() {
    return selfLinkWithId;
  }

  /**
   * [Output Only] Server-defined URL for this resource with the resource id.
   * @param selfLinkWithId selfLinkWithId or {@code null} for none
   */
  public HealthCheck setSelfLinkWithId(java.lang.String selfLinkWithId) {
    this.selfLinkWithId = selfLinkWithId;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public SSLHealthCheck getSslHealthCheck() {
    return sslHealthCheck;
  }

  /**
   * @param sslHealthCheck sslHealthCheck or {@code null} for none
   */
  public HealthCheck setSslHealthCheck(SSLHealthCheck sslHealthCheck) {
    this.sslHealthCheck = sslHealthCheck;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public TCPHealthCheck getTcpHealthCheck() {
    return tcpHealthCheck;
  }

  /**
   * @param tcpHealthCheck tcpHealthCheck or {@code null} for none
   */
  public HealthCheck setTcpHealthCheck(TCPHealthCheck tcpHealthCheck) {
    this.tcpHealthCheck = tcpHealthCheck;
    return this;
  }

  /**
   * How long (in seconds) to wait before claiming failure. The default value is 5 seconds. It is
   * invalid for timeoutSec to have greater value than checkIntervalSec.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getTimeoutSec() {
    return timeoutSec;
  }

  /**
   * How long (in seconds) to wait before claiming failure. The default value is 5 seconds. It is
   * invalid for timeoutSec to have greater value than checkIntervalSec.
   * @param timeoutSec timeoutSec or {@code null} for none
   */
  public HealthCheck setTimeoutSec(java.lang.Integer timeoutSec) {
    this.timeoutSec = timeoutSec;
    return this;
  }

  /**
   * Specifies the type of the healthCheck, either TCP, SSL, HTTP, HTTPS or HTTP2. If not specified,
   * the default is TCP. Exactly one of the protocol-specific health check field must be specified,
   * which must match type field.
   * @return value or {@code null} for none
   */
  public java.lang.String getType() {
    return type;
  }

  /**
   * Specifies the type of the healthCheck, either TCP, SSL, HTTP, HTTPS or HTTP2. If not specified,
   * the default is TCP. Exactly one of the protocol-specific health check field must be specified,
   * which must match type field.
   * @param type type or {@code null} for none
   */
  public HealthCheck setType(java.lang.String type) {
    this.type = type;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public UDPHealthCheck getUdpHealthCheck() {
    return udpHealthCheck;
  }

  /**
   * @param udpHealthCheck udpHealthCheck or {@code null} for none
   */
  public HealthCheck setUdpHealthCheck(UDPHealthCheck udpHealthCheck) {
    this.udpHealthCheck = udpHealthCheck;
    return this;
  }

  /**
   * A so-far healthy instance will be marked unhealthy after this many consecutive failures. The
   * default value is 2.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getUnhealthyThreshold() {
    return unhealthyThreshold;
  }

  /**
   * A so-far healthy instance will be marked unhealthy after this many consecutive failures. The
   * default value is 2.
   * @param unhealthyThreshold unhealthyThreshold or {@code null} for none
   */
  public HealthCheck setUnhealthyThreshold(java.lang.Integer unhealthyThreshold) {
    this.unhealthyThreshold = unhealthyThreshold;
    return this;
  }

  @Override
  public HealthCheck set(String fieldName, Object value) {
    return (HealthCheck) super.set(fieldName, value);
  }

  @Override
  public HealthCheck clone() {
    return (HealthCheck) super.clone();
  }

}
