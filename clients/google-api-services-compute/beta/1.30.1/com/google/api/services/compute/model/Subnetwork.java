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
 * Represents a Subnetwork resource.
 *
 * A subnetwork (also known as a subnet) is a logical partition of a Virtual Private Cloud network
 * with one primary IP range and zero or more secondary IP ranges. For more information, read
 * Virtual Private Cloud (VPC) Network. (== resource_for {$api_version}.subnetworks ==)
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Compute Engine API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Subnetwork extends com.google.api.client.json.GenericJson {

  /**
   * Whether this subnetwork can conflict with static routes. Setting this to true allows this
   * subnetwork's primary and secondary ranges to conflict with routes that have already been
   * configured on the corresponding network. Static routes will take precedence over the subnetwork
   * route if the route prefix length is at least as large as the subnetwork prefix length.
   *
   * Also, packets destined to IPs within subnetwork may contain private/sensitive data and are
   * prevented from leaving the virtual network. Setting this field to true will disable this
   * feature.
   *
   * The default value is false and applies to all existing subnetworks and automatically created
   * subnetworks.
   *
   * This field cannot be set to true at resource creation time.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean allowSubnetCidrRoutesOverlap;

  /**
   * [Output Only] Creation timestamp in RFC3339 text format.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String creationTimestamp;

  /**
   * An optional description of this resource. Provide this property when you create the resource.
   * This field can be set only at resource creation time.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String description;

  /**
   * Whether to enable flow logging for this subnetwork. If this field is not explicitly set, it
   * will not appear in get listings. If not set the default behavior is to disable flow logging.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean enableFlowLogs;

  /**
   * Fingerprint of this resource. A hash of the contents stored in this object. This field is used
   * in optimistic locking. This field will be ignored when inserting a Subnetwork. An up-to-date
   * fingerprint must be provided in order to update the Subnetwork, otherwise the request will fail
   * with error 412 conditionNotMet.
   *
   * To see the latest fingerprint, make a get() request to retrieve a Subnetwork.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String fingerprint;

  /**
   * [Output Only] The gateway address for default routes to reach destination addresses outside
   * this subnetwork.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String gatewayAddress;

  /**
   * [Output Only] The unique identifier for the resource. This identifier is defined by the server.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.math.BigInteger id;

  /**
   * The range of internal addresses that are owned by this subnetwork. Provide this property when
   * you create the subnetwork. For example, 10.0.0.0/8 or 192.168.0.0/16. Ranges must be unique and
   * non-overlapping within a network. Only IPv4 is supported. This field can be set only at
   * resource creation time.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String ipCidrRange;

  /**
   * [Output Only] The range of internal IPv6 addresses that are owned by this subnetwork.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String ipv6CidrRange;

  /**
   * [Output Only] Type of the resource. Always compute#subnetwork for Subnetwork resources.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kind;

  /**
   * This field denotes the VPC flow logging options for this subnetwork. If logging is enabled,
   * logs are exported to Stackdriver.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private SubnetworkLogConfig logConfig;

  /**
   * The name of the resource, provided by the client when initially creating the resource. The name
   * must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63
   * characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the
   * first character must be a lowercase letter, and all following characters must be a dash,
   * lowercase letter, or digit, except the last character, which cannot be a dash.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * The URL of the network to which this subnetwork belongs, provided by the client when initially
   * creating the subnetwork. Only networks that are in the distributed mode can have subnetworks.
   * This field can be set only at resource creation time.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String network;

  /**
   * Whether the VMs in this subnet can access Google services without assigned external IP
   * addresses. This field can be both set at resource creation time and updated using
   * setPrivateIpGoogleAccess.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean privateIpGoogleAccess;

  /**
   * The private IPv6 google access type for the VMs in this subnet. This is an expanded field of
   * enablePrivateV6Access. If both fields are set, privateIpv6GoogleAccess will take priority.
   *
   * This field can be both set at resource creation time and updated using patch.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String privateIpv6GoogleAccess;

  /**
   * Deprecated in favor of enable PrivateIpv6GoogleAccess on instance directly. The service
   * accounts can be used to selectively turn on Private IPv6 Google Access only on the VMs primary
   * service account matching the value. This value only takes effect when PrivateIpv6GoogleAccess
   * is ENABLE_OUTBOUND_VM_ACCESS_TO_GOOGLE_FOR_SERVICE_ACCOUNTS or
   * ENABLE_BIDIRECTIONAL_ACCESS_TO_GOOGLE_FOR_SERVICE_ACCOUNTS.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> privateIpv6GoogleAccessServiceAccounts;

  /**
   * The purpose of the resource. This field can be either PRIVATE_RFC_1918 or
   * INTERNAL_HTTPS_LOAD_BALANCER. A subnetwork with purpose set to INTERNAL_HTTPS_LOAD_BALANCER is
   * a user-created subnetwork that is reserved for Internal HTTP(S) Load Balancing. If unspecified,
   * the purpose defaults to PRIVATE_RFC_1918.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String purpose;

  /**
   * URL of the region where the Subnetwork resides. This field can be set only at resource creation
   * time.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String region;

  /**
   * The role of subnetwork. Currenly, this field is only used when purpose =
   * INTERNAL_HTTPS_LOAD_BALANCER. The value can be set to ACTIVE or BACKUP. An ACTIVE subnetwork is
   * one that is currently being used for Internal HTTP(S) Load Balancing. A BACKUP subnetwork is
   * one that is ready to be promoted to ACTIVE or is currently draining. This field can be updated
   * with a patch request.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String role;

  /**
   * An array of configurations for secondary IP ranges for VM instances contained in this
   * subnetwork. The primary IP of such VM must belong to the primary ipCidrRange of the subnetwork.
   * The alias IPs may belong to either primary or secondary ranges. This field can be updated with
   * a patch request.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<SubnetworkSecondaryRange> secondaryIpRanges;

  /**
   * [Output Only] Server-defined URL for the resource.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String selfLink;

  /**
   * [Output Only] The state of the subnetwork, which can be one of READY or DRAINING. A subnetwork
   * that is READY is ready to be used. The state of DRAINING is only applicable to subnetworks that
   * have the purpose set to INTERNAL_HTTPS_LOAD_BALANCER and indicates that connections to the load
   * balancer are being drained. A subnetwork that is draining cannot be used or modified until it
   * reaches a status of READY.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String state;

  /**
   * Whether this subnetwork can conflict with static routes. Setting this to true allows this
   * subnetwork's primary and secondary ranges to conflict with routes that have already been
   * configured on the corresponding network. Static routes will take precedence over the subnetwork
   * route if the route prefix length is at least as large as the subnetwork prefix length.
   *
   * Also, packets destined to IPs within subnetwork may contain private/sensitive data and are
   * prevented from leaving the virtual network. Setting this field to true will disable this
   * feature.
   *
   * The default value is false and applies to all existing subnetworks and automatically created
   * subnetworks.
   *
   * This field cannot be set to true at resource creation time.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getAllowSubnetCidrRoutesOverlap() {
    return allowSubnetCidrRoutesOverlap;
  }

  /**
   * Whether this subnetwork can conflict with static routes. Setting this to true allows this
   * subnetwork's primary and secondary ranges to conflict with routes that have already been
   * configured on the corresponding network. Static routes will take precedence over the subnetwork
   * route if the route prefix length is at least as large as the subnetwork prefix length.
   *
   * Also, packets destined to IPs within subnetwork may contain private/sensitive data and are
   * prevented from leaving the virtual network. Setting this field to true will disable this
   * feature.
   *
   * The default value is false and applies to all existing subnetworks and automatically created
   * subnetworks.
   *
   * This field cannot be set to true at resource creation time.
   * @param allowSubnetCidrRoutesOverlap allowSubnetCidrRoutesOverlap or {@code null} for none
   */
  public Subnetwork setAllowSubnetCidrRoutesOverlap(java.lang.Boolean allowSubnetCidrRoutesOverlap) {
    this.allowSubnetCidrRoutesOverlap = allowSubnetCidrRoutesOverlap;
    return this;
  }

  /**
   * [Output Only] Creation timestamp in RFC3339 text format.
   * @return value or {@code null} for none
   */
  public java.lang.String getCreationTimestamp() {
    return creationTimestamp;
  }

  /**
   * [Output Only] Creation timestamp in RFC3339 text format.
   * @param creationTimestamp creationTimestamp or {@code null} for none
   */
  public Subnetwork setCreationTimestamp(java.lang.String creationTimestamp) {
    this.creationTimestamp = creationTimestamp;
    return this;
  }

  /**
   * An optional description of this resource. Provide this property when you create the resource.
   * This field can be set only at resource creation time.
   * @return value or {@code null} for none
   */
  public java.lang.String getDescription() {
    return description;
  }

  /**
   * An optional description of this resource. Provide this property when you create the resource.
   * This field can be set only at resource creation time.
   * @param description description or {@code null} for none
   */
  public Subnetwork setDescription(java.lang.String description) {
    this.description = description;
    return this;
  }

  /**
   * Whether to enable flow logging for this subnetwork. If this field is not explicitly set, it
   * will not appear in get listings. If not set the default behavior is to disable flow logging.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getEnableFlowLogs() {
    return enableFlowLogs;
  }

  /**
   * Whether to enable flow logging for this subnetwork. If this field is not explicitly set, it
   * will not appear in get listings. If not set the default behavior is to disable flow logging.
   * @param enableFlowLogs enableFlowLogs or {@code null} for none
   */
  public Subnetwork setEnableFlowLogs(java.lang.Boolean enableFlowLogs) {
    this.enableFlowLogs = enableFlowLogs;
    return this;
  }

  /**
   * Fingerprint of this resource. A hash of the contents stored in this object. This field is used
   * in optimistic locking. This field will be ignored when inserting a Subnetwork. An up-to-date
   * fingerprint must be provided in order to update the Subnetwork, otherwise the request will fail
   * with error 412 conditionNotMet.
   *
   * To see the latest fingerprint, make a get() request to retrieve a Subnetwork.
   * @see #decodeFingerprint()
   * @return value or {@code null} for none
   */
  public java.lang.String getFingerprint() {
    return fingerprint;
  }

  /**
   * Fingerprint of this resource. A hash of the contents stored in this object. This field is used
   * in optimistic locking. This field will be ignored when inserting a Subnetwork. An up-to-date
   * fingerprint must be provided in order to update the Subnetwork, otherwise the request will fail
   * with error 412 conditionNotMet.
   *
   * To see the latest fingerprint, make a get() request to retrieve a Subnetwork.
   * @see #getFingerprint()
   * @return Base64 decoded value or {@code null} for none
   *
   * @since 1.14
   */
  public byte[] decodeFingerprint() {
    return com.google.api.client.util.Base64.decodeBase64(fingerprint);
  }

  /**
   * Fingerprint of this resource. A hash of the contents stored in this object. This field is used
   * in optimistic locking. This field will be ignored when inserting a Subnetwork. An up-to-date
   * fingerprint must be provided in order to update the Subnetwork, otherwise the request will fail
   * with error 412 conditionNotMet.
   *
   * To see the latest fingerprint, make a get() request to retrieve a Subnetwork.
   * @see #encodeFingerprint()
   * @param fingerprint fingerprint or {@code null} for none
   */
  public Subnetwork setFingerprint(java.lang.String fingerprint) {
    this.fingerprint = fingerprint;
    return this;
  }

  /**
   * Fingerprint of this resource. A hash of the contents stored in this object. This field is used
   * in optimistic locking. This field will be ignored when inserting a Subnetwork. An up-to-date
   * fingerprint must be provided in order to update the Subnetwork, otherwise the request will fail
   * with error 412 conditionNotMet.
   *
   * To see the latest fingerprint, make a get() request to retrieve a Subnetwork.
   * @see #setFingerprint()
   *
   * <p>
   * The value is encoded Base64 or {@code null} for none.
   * </p>
   *
   * @since 1.14
   */
  public Subnetwork encodeFingerprint(byte[] fingerprint) {
    this.fingerprint = com.google.api.client.util.Base64.encodeBase64URLSafeString(fingerprint);
    return this;
  }

  /**
   * [Output Only] The gateway address for default routes to reach destination addresses outside
   * this subnetwork.
   * @return value or {@code null} for none
   */
  public java.lang.String getGatewayAddress() {
    return gatewayAddress;
  }

  /**
   * [Output Only] The gateway address for default routes to reach destination addresses outside
   * this subnetwork.
   * @param gatewayAddress gatewayAddress or {@code null} for none
   */
  public Subnetwork setGatewayAddress(java.lang.String gatewayAddress) {
    this.gatewayAddress = gatewayAddress;
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
  public Subnetwork setId(java.math.BigInteger id) {
    this.id = id;
    return this;
  }

  /**
   * The range of internal addresses that are owned by this subnetwork. Provide this property when
   * you create the subnetwork. For example, 10.0.0.0/8 or 192.168.0.0/16. Ranges must be unique and
   * non-overlapping within a network. Only IPv4 is supported. This field can be set only at
   * resource creation time.
   * @return value or {@code null} for none
   */
  public java.lang.String getIpCidrRange() {
    return ipCidrRange;
  }

  /**
   * The range of internal addresses that are owned by this subnetwork. Provide this property when
   * you create the subnetwork. For example, 10.0.0.0/8 or 192.168.0.0/16. Ranges must be unique and
   * non-overlapping within a network. Only IPv4 is supported. This field can be set only at
   * resource creation time.
   * @param ipCidrRange ipCidrRange or {@code null} for none
   */
  public Subnetwork setIpCidrRange(java.lang.String ipCidrRange) {
    this.ipCidrRange = ipCidrRange;
    return this;
  }

  /**
   * [Output Only] The range of internal IPv6 addresses that are owned by this subnetwork.
   * @return value or {@code null} for none
   */
  public java.lang.String getIpv6CidrRange() {
    return ipv6CidrRange;
  }

  /**
   * [Output Only] The range of internal IPv6 addresses that are owned by this subnetwork.
   * @param ipv6CidrRange ipv6CidrRange or {@code null} for none
   */
  public Subnetwork setIpv6CidrRange(java.lang.String ipv6CidrRange) {
    this.ipv6CidrRange = ipv6CidrRange;
    return this;
  }

  /**
   * [Output Only] Type of the resource. Always compute#subnetwork for Subnetwork resources.
   * @return value or {@code null} for none
   */
  public java.lang.String getKind() {
    return kind;
  }

  /**
   * [Output Only] Type of the resource. Always compute#subnetwork for Subnetwork resources.
   * @param kind kind or {@code null} for none
   */
  public Subnetwork setKind(java.lang.String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * This field denotes the VPC flow logging options for this subnetwork. If logging is enabled,
   * logs are exported to Stackdriver.
   * @return value or {@code null} for none
   */
  public SubnetworkLogConfig getLogConfig() {
    return logConfig;
  }

  /**
   * This field denotes the VPC flow logging options for this subnetwork. If logging is enabled,
   * logs are exported to Stackdriver.
   * @param logConfig logConfig or {@code null} for none
   */
  public Subnetwork setLogConfig(SubnetworkLogConfig logConfig) {
    this.logConfig = logConfig;
    return this;
  }

  /**
   * The name of the resource, provided by the client when initially creating the resource. The name
   * must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63
   * characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the
   * first character must be a lowercase letter, and all following characters must be a dash,
   * lowercase letter, or digit, except the last character, which cannot be a dash.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * The name of the resource, provided by the client when initially creating the resource. The name
   * must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63
   * characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the
   * first character must be a lowercase letter, and all following characters must be a dash,
   * lowercase letter, or digit, except the last character, which cannot be a dash.
   * @param name name or {@code null} for none
   */
  public Subnetwork setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * The URL of the network to which this subnetwork belongs, provided by the client when initially
   * creating the subnetwork. Only networks that are in the distributed mode can have subnetworks.
   * This field can be set only at resource creation time.
   * @return value or {@code null} for none
   */
  public java.lang.String getNetwork() {
    return network;
  }

  /**
   * The URL of the network to which this subnetwork belongs, provided by the client when initially
   * creating the subnetwork. Only networks that are in the distributed mode can have subnetworks.
   * This field can be set only at resource creation time.
   * @param network network or {@code null} for none
   */
  public Subnetwork setNetwork(java.lang.String network) {
    this.network = network;
    return this;
  }

  /**
   * Whether the VMs in this subnet can access Google services without assigned external IP
   * addresses. This field can be both set at resource creation time and updated using
   * setPrivateIpGoogleAccess.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getPrivateIpGoogleAccess() {
    return privateIpGoogleAccess;
  }

  /**
   * Whether the VMs in this subnet can access Google services without assigned external IP
   * addresses. This field can be both set at resource creation time and updated using
   * setPrivateIpGoogleAccess.
   * @param privateIpGoogleAccess privateIpGoogleAccess or {@code null} for none
   */
  public Subnetwork setPrivateIpGoogleAccess(java.lang.Boolean privateIpGoogleAccess) {
    this.privateIpGoogleAccess = privateIpGoogleAccess;
    return this;
  }

  /**
   * The private IPv6 google access type for the VMs in this subnet. This is an expanded field of
   * enablePrivateV6Access. If both fields are set, privateIpv6GoogleAccess will take priority.
   *
   * This field can be both set at resource creation time and updated using patch.
   * @return value or {@code null} for none
   */
  public java.lang.String getPrivateIpv6GoogleAccess() {
    return privateIpv6GoogleAccess;
  }

  /**
   * The private IPv6 google access type for the VMs in this subnet. This is an expanded field of
   * enablePrivateV6Access. If both fields are set, privateIpv6GoogleAccess will take priority.
   *
   * This field can be both set at resource creation time and updated using patch.
   * @param privateIpv6GoogleAccess privateIpv6GoogleAccess or {@code null} for none
   */
  public Subnetwork setPrivateIpv6GoogleAccess(java.lang.String privateIpv6GoogleAccess) {
    this.privateIpv6GoogleAccess = privateIpv6GoogleAccess;
    return this;
  }

  /**
   * Deprecated in favor of enable PrivateIpv6GoogleAccess on instance directly. The service
   * accounts can be used to selectively turn on Private IPv6 Google Access only on the VMs primary
   * service account matching the value. This value only takes effect when PrivateIpv6GoogleAccess
   * is ENABLE_OUTBOUND_VM_ACCESS_TO_GOOGLE_FOR_SERVICE_ACCOUNTS or
   * ENABLE_BIDIRECTIONAL_ACCESS_TO_GOOGLE_FOR_SERVICE_ACCOUNTS.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getPrivateIpv6GoogleAccessServiceAccounts() {
    return privateIpv6GoogleAccessServiceAccounts;
  }

  /**
   * Deprecated in favor of enable PrivateIpv6GoogleAccess on instance directly. The service
   * accounts can be used to selectively turn on Private IPv6 Google Access only on the VMs primary
   * service account matching the value. This value only takes effect when PrivateIpv6GoogleAccess
   * is ENABLE_OUTBOUND_VM_ACCESS_TO_GOOGLE_FOR_SERVICE_ACCOUNTS or
   * ENABLE_BIDIRECTIONAL_ACCESS_TO_GOOGLE_FOR_SERVICE_ACCOUNTS.
   * @param privateIpv6GoogleAccessServiceAccounts privateIpv6GoogleAccessServiceAccounts or {@code null} for none
   */
  public Subnetwork setPrivateIpv6GoogleAccessServiceAccounts(java.util.List<java.lang.String> privateIpv6GoogleAccessServiceAccounts) {
    this.privateIpv6GoogleAccessServiceAccounts = privateIpv6GoogleAccessServiceAccounts;
    return this;
  }

  /**
   * The purpose of the resource. This field can be either PRIVATE_RFC_1918 or
   * INTERNAL_HTTPS_LOAD_BALANCER. A subnetwork with purpose set to INTERNAL_HTTPS_LOAD_BALANCER is
   * a user-created subnetwork that is reserved for Internal HTTP(S) Load Balancing. If unspecified,
   * the purpose defaults to PRIVATE_RFC_1918.
   * @return value or {@code null} for none
   */
  public java.lang.String getPurpose() {
    return purpose;
  }

  /**
   * The purpose of the resource. This field can be either PRIVATE_RFC_1918 or
   * INTERNAL_HTTPS_LOAD_BALANCER. A subnetwork with purpose set to INTERNAL_HTTPS_LOAD_BALANCER is
   * a user-created subnetwork that is reserved for Internal HTTP(S) Load Balancing. If unspecified,
   * the purpose defaults to PRIVATE_RFC_1918.
   * @param purpose purpose or {@code null} for none
   */
  public Subnetwork setPurpose(java.lang.String purpose) {
    this.purpose = purpose;
    return this;
  }

  /**
   * URL of the region where the Subnetwork resides. This field can be set only at resource creation
   * time.
   * @return value or {@code null} for none
   */
  public java.lang.String getRegion() {
    return region;
  }

  /**
   * URL of the region where the Subnetwork resides. This field can be set only at resource creation
   * time.
   * @param region region or {@code null} for none
   */
  public Subnetwork setRegion(java.lang.String region) {
    this.region = region;
    return this;
  }

  /**
   * The role of subnetwork. Currenly, this field is only used when purpose =
   * INTERNAL_HTTPS_LOAD_BALANCER. The value can be set to ACTIVE or BACKUP. An ACTIVE subnetwork is
   * one that is currently being used for Internal HTTP(S) Load Balancing. A BACKUP subnetwork is
   * one that is ready to be promoted to ACTIVE or is currently draining. This field can be updated
   * with a patch request.
   * @return value or {@code null} for none
   */
  public java.lang.String getRole() {
    return role;
  }

  /**
   * The role of subnetwork. Currenly, this field is only used when purpose =
   * INTERNAL_HTTPS_LOAD_BALANCER. The value can be set to ACTIVE or BACKUP. An ACTIVE subnetwork is
   * one that is currently being used for Internal HTTP(S) Load Balancing. A BACKUP subnetwork is
   * one that is ready to be promoted to ACTIVE or is currently draining. This field can be updated
   * with a patch request.
   * @param role role or {@code null} for none
   */
  public Subnetwork setRole(java.lang.String role) {
    this.role = role;
    return this;
  }

  /**
   * An array of configurations for secondary IP ranges for VM instances contained in this
   * subnetwork. The primary IP of such VM must belong to the primary ipCidrRange of the subnetwork.
   * The alias IPs may belong to either primary or secondary ranges. This field can be updated with
   * a patch request.
   * @return value or {@code null} for none
   */
  public java.util.List<SubnetworkSecondaryRange> getSecondaryIpRanges() {
    return secondaryIpRanges;
  }

  /**
   * An array of configurations for secondary IP ranges for VM instances contained in this
   * subnetwork. The primary IP of such VM must belong to the primary ipCidrRange of the subnetwork.
   * The alias IPs may belong to either primary or secondary ranges. This field can be updated with
   * a patch request.
   * @param secondaryIpRanges secondaryIpRanges or {@code null} for none
   */
  public Subnetwork setSecondaryIpRanges(java.util.List<SubnetworkSecondaryRange> secondaryIpRanges) {
    this.secondaryIpRanges = secondaryIpRanges;
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
  public Subnetwork setSelfLink(java.lang.String selfLink) {
    this.selfLink = selfLink;
    return this;
  }

  /**
   * [Output Only] The state of the subnetwork, which can be one of READY or DRAINING. A subnetwork
   * that is READY is ready to be used. The state of DRAINING is only applicable to subnetworks that
   * have the purpose set to INTERNAL_HTTPS_LOAD_BALANCER and indicates that connections to the load
   * balancer are being drained. A subnetwork that is draining cannot be used or modified until it
   * reaches a status of READY.
   * @return value or {@code null} for none
   */
  public java.lang.String getState() {
    return state;
  }

  /**
   * [Output Only] The state of the subnetwork, which can be one of READY or DRAINING. A subnetwork
   * that is READY is ready to be used. The state of DRAINING is only applicable to subnetworks that
   * have the purpose set to INTERNAL_HTTPS_LOAD_BALANCER and indicates that connections to the load
   * balancer are being drained. A subnetwork that is draining cannot be used or modified until it
   * reaches a status of READY.
   * @param state state or {@code null} for none
   */
  public Subnetwork setState(java.lang.String state) {
    this.state = state;
    return this;
  }

  @Override
  public Subnetwork set(String fieldName, Object value) {
    return (Subnetwork) super.set(fieldName, value);
  }

  @Override
  public Subnetwork clone() {
    return (Subnetwork) super.clone();
  }

}
