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
 * Model definition for InstanceProperties.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Compute Engine API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class InstanceProperties extends com.google.api.client.json.GenericJson {

  /**
   * Enables instances created based on this template to send packets with source IP addresses other
   * than their own and receive packets with destination IP addresses other than their own. If these
   * instances will be used as an IP gateway or it will be set as the next-hop in a Route resource,
   * specify true. If unsure, leave this set to false. See the Enable IP forwarding documentation
   * for more information.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean canIpForward;

  /**
   * Specifies the Confidential Instance options.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ConfidentialInstanceConfig confidentialInstanceConfig;

  /**
   * An optional text description for the instances that are created from this instance template.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String description;

  /**
   * An array of disks that are associated with the instances that are created from this template.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<AttachedDisk> disks;

  static {
    // hack to force ProGuard to consider AttachedDisk used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(AttachedDisk.class);
  }

  /**
   * Display Device properties to enable support for remote display products like: Teradici, VNC and
   * TeamViewer
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private DisplayDevice displayDevice;

  /**
   * A list of guest accelerator cards' type and count to use for instances created from the
   * instance template.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<AcceleratorConfig> guestAccelerators;

  static {
    // hack to force ProGuard to consider AcceleratorConfig used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(AcceleratorConfig.class);
  }

  /**
   * Labels to apply to instances that are created from this template.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.String> labels;

  /**
   * The machine type to use for instances that are created from this template.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String machineType;

  /**
   * The metadata key/value pairs to assign to instances that are created from this template. These
   * pairs can consist of custom metadata or predefined keys. See Project and instance metadata for
   * more information.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Metadata metadata;

  /**
   * Minimum cpu/platform to be used by this instance. The instance may be scheduled on the
   * specified or newer cpu/platform. Applicable values are the friendly names of CPU platforms,
   * such as minCpuPlatform: "Intel Haswell" or minCpuPlatform: "Intel Sandy Bridge". For more
   * information, read Specifying a Minimum CPU Platform.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String minCpuPlatform;

  /**
   * An array of network access configurations for this interface.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<NetworkInterface> networkInterfaces;

  /**
   * Specifies whether this instance will be shut down on key revocation.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String postKeyRevocationActionType;

  /**
   * Specifies the reservations that this instance can consume from.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ReservationAffinity reservationAffinity;

  /**
   * Resource policies (names, not ULRs) applied to instances created from this templae.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> resourcePolicies;

  /**
   * Specifies the scheduling options for the instances that are created from this template.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Scheduling scheduling;

  /**
   * A list of service accounts with specified scopes. Access tokens for these service accounts are
   * available to the instances that are created from this template. Use metadata queries to obtain
   * the access tokens for these instances.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<ServiceAccount> serviceAccounts;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ShieldedInstanceConfig shieldedInstanceConfig;

  /**
   * Specifies the Shielded VM options for the instances that are created from this template.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ShieldedVmConfig shieldedVmConfig;

  /**
   * A list of tags to apply to the instances that are created from this template. The tags identify
   * valid sources or targets for network firewalls. The setTags method can modify this list of
   * tags. Each tag within the list must comply with RFC1035.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Tags tags;

  /**
   * Enables instances created based on this template to send packets with source IP addresses other
   * than their own and receive packets with destination IP addresses other than their own. If these
   * instances will be used as an IP gateway or it will be set as the next-hop in a Route resource,
   * specify true. If unsure, leave this set to false. See the Enable IP forwarding documentation
   * for more information.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getCanIpForward() {
    return canIpForward;
  }

  /**
   * Enables instances created based on this template to send packets with source IP addresses other
   * than their own and receive packets with destination IP addresses other than their own. If these
   * instances will be used as an IP gateway or it will be set as the next-hop in a Route resource,
   * specify true. If unsure, leave this set to false. See the Enable IP forwarding documentation
   * for more information.
   * @param canIpForward canIpForward or {@code null} for none
   */
  public InstanceProperties setCanIpForward(java.lang.Boolean canIpForward) {
    this.canIpForward = canIpForward;
    return this;
  }

  /**
   * Specifies the Confidential Instance options.
   * @return value or {@code null} for none
   */
  public ConfidentialInstanceConfig getConfidentialInstanceConfig() {
    return confidentialInstanceConfig;
  }

  /**
   * Specifies the Confidential Instance options.
   * @param confidentialInstanceConfig confidentialInstanceConfig or {@code null} for none
   */
  public InstanceProperties setConfidentialInstanceConfig(ConfidentialInstanceConfig confidentialInstanceConfig) {
    this.confidentialInstanceConfig = confidentialInstanceConfig;
    return this;
  }

  /**
   * An optional text description for the instances that are created from this instance template.
   * @return value or {@code null} for none
   */
  public java.lang.String getDescription() {
    return description;
  }

  /**
   * An optional text description for the instances that are created from this instance template.
   * @param description description or {@code null} for none
   */
  public InstanceProperties setDescription(java.lang.String description) {
    this.description = description;
    return this;
  }

  /**
   * An array of disks that are associated with the instances that are created from this template.
   * @return value or {@code null} for none
   */
  public java.util.List<AttachedDisk> getDisks() {
    return disks;
  }

  /**
   * An array of disks that are associated with the instances that are created from this template.
   * @param disks disks or {@code null} for none
   */
  public InstanceProperties setDisks(java.util.List<AttachedDisk> disks) {
    this.disks = disks;
    return this;
  }

  /**
   * Display Device properties to enable support for remote display products like: Teradici, VNC and
   * TeamViewer
   * @return value or {@code null} for none
   */
  public DisplayDevice getDisplayDevice() {
    return displayDevice;
  }

  /**
   * Display Device properties to enable support for remote display products like: Teradici, VNC and
   * TeamViewer
   * @param displayDevice displayDevice or {@code null} for none
   */
  public InstanceProperties setDisplayDevice(DisplayDevice displayDevice) {
    this.displayDevice = displayDevice;
    return this;
  }

  /**
   * A list of guest accelerator cards' type and count to use for instances created from the
   * instance template.
   * @return value or {@code null} for none
   */
  public java.util.List<AcceleratorConfig> getGuestAccelerators() {
    return guestAccelerators;
  }

  /**
   * A list of guest accelerator cards' type and count to use for instances created from the
   * instance template.
   * @param guestAccelerators guestAccelerators or {@code null} for none
   */
  public InstanceProperties setGuestAccelerators(java.util.List<AcceleratorConfig> guestAccelerators) {
    this.guestAccelerators = guestAccelerators;
    return this;
  }

  /**
   * Labels to apply to instances that are created from this template.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.String> getLabels() {
    return labels;
  }

  /**
   * Labels to apply to instances that are created from this template.
   * @param labels labels or {@code null} for none
   */
  public InstanceProperties setLabels(java.util.Map<String, java.lang.String> labels) {
    this.labels = labels;
    return this;
  }

  /**
   * The machine type to use for instances that are created from this template.
   * @return value or {@code null} for none
   */
  public java.lang.String getMachineType() {
    return machineType;
  }

  /**
   * The machine type to use for instances that are created from this template.
   * @param machineType machineType or {@code null} for none
   */
  public InstanceProperties setMachineType(java.lang.String machineType) {
    this.machineType = machineType;
    return this;
  }

  /**
   * The metadata key/value pairs to assign to instances that are created from this template. These
   * pairs can consist of custom metadata or predefined keys. See Project and instance metadata for
   * more information.
   * @return value or {@code null} for none
   */
  public Metadata getMetadata() {
    return metadata;
  }

  /**
   * The metadata key/value pairs to assign to instances that are created from this template. These
   * pairs can consist of custom metadata or predefined keys. See Project and instance metadata for
   * more information.
   * @param metadata metadata or {@code null} for none
   */
  public InstanceProperties setMetadata(Metadata metadata) {
    this.metadata = metadata;
    return this;
  }

  /**
   * Minimum cpu/platform to be used by this instance. The instance may be scheduled on the
   * specified or newer cpu/platform. Applicable values are the friendly names of CPU platforms,
   * such as minCpuPlatform: "Intel Haswell" or minCpuPlatform: "Intel Sandy Bridge". For more
   * information, read Specifying a Minimum CPU Platform.
   * @return value or {@code null} for none
   */
  public java.lang.String getMinCpuPlatform() {
    return minCpuPlatform;
  }

  /**
   * Minimum cpu/platform to be used by this instance. The instance may be scheduled on the
   * specified or newer cpu/platform. Applicable values are the friendly names of CPU platforms,
   * such as minCpuPlatform: "Intel Haswell" or minCpuPlatform: "Intel Sandy Bridge". For more
   * information, read Specifying a Minimum CPU Platform.
   * @param minCpuPlatform minCpuPlatform or {@code null} for none
   */
  public InstanceProperties setMinCpuPlatform(java.lang.String minCpuPlatform) {
    this.minCpuPlatform = minCpuPlatform;
    return this;
  }

  /**
   * An array of network access configurations for this interface.
   * @return value or {@code null} for none
   */
  public java.util.List<NetworkInterface> getNetworkInterfaces() {
    return networkInterfaces;
  }

  /**
   * An array of network access configurations for this interface.
   * @param networkInterfaces networkInterfaces or {@code null} for none
   */
  public InstanceProperties setNetworkInterfaces(java.util.List<NetworkInterface> networkInterfaces) {
    this.networkInterfaces = networkInterfaces;
    return this;
  }

  /**
   * Specifies whether this instance will be shut down on key revocation.
   * @return value or {@code null} for none
   */
  public java.lang.String getPostKeyRevocationActionType() {
    return postKeyRevocationActionType;
  }

  /**
   * Specifies whether this instance will be shut down on key revocation.
   * @param postKeyRevocationActionType postKeyRevocationActionType or {@code null} for none
   */
  public InstanceProperties setPostKeyRevocationActionType(java.lang.String postKeyRevocationActionType) {
    this.postKeyRevocationActionType = postKeyRevocationActionType;
    return this;
  }

  /**
   * Specifies the reservations that this instance can consume from.
   * @return value or {@code null} for none
   */
  public ReservationAffinity getReservationAffinity() {
    return reservationAffinity;
  }

  /**
   * Specifies the reservations that this instance can consume from.
   * @param reservationAffinity reservationAffinity or {@code null} for none
   */
  public InstanceProperties setReservationAffinity(ReservationAffinity reservationAffinity) {
    this.reservationAffinity = reservationAffinity;
    return this;
  }

  /**
   * Resource policies (names, not ULRs) applied to instances created from this templae.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getResourcePolicies() {
    return resourcePolicies;
  }

  /**
   * Resource policies (names, not ULRs) applied to instances created from this templae.
   * @param resourcePolicies resourcePolicies or {@code null} for none
   */
  public InstanceProperties setResourcePolicies(java.util.List<java.lang.String> resourcePolicies) {
    this.resourcePolicies = resourcePolicies;
    return this;
  }

  /**
   * Specifies the scheduling options for the instances that are created from this template.
   * @return value or {@code null} for none
   */
  public Scheduling getScheduling() {
    return scheduling;
  }

  /**
   * Specifies the scheduling options for the instances that are created from this template.
   * @param scheduling scheduling or {@code null} for none
   */
  public InstanceProperties setScheduling(Scheduling scheduling) {
    this.scheduling = scheduling;
    return this;
  }

  /**
   * A list of service accounts with specified scopes. Access tokens for these service accounts are
   * available to the instances that are created from this template. Use metadata queries to obtain
   * the access tokens for these instances.
   * @return value or {@code null} for none
   */
  public java.util.List<ServiceAccount> getServiceAccounts() {
    return serviceAccounts;
  }

  /**
   * A list of service accounts with specified scopes. Access tokens for these service accounts are
   * available to the instances that are created from this template. Use metadata queries to obtain
   * the access tokens for these instances.
   * @param serviceAccounts serviceAccounts or {@code null} for none
   */
  public InstanceProperties setServiceAccounts(java.util.List<ServiceAccount> serviceAccounts) {
    this.serviceAccounts = serviceAccounts;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public ShieldedInstanceConfig getShieldedInstanceConfig() {
    return shieldedInstanceConfig;
  }

  /**
   * @param shieldedInstanceConfig shieldedInstanceConfig or {@code null} for none
   */
  public InstanceProperties setShieldedInstanceConfig(ShieldedInstanceConfig shieldedInstanceConfig) {
    this.shieldedInstanceConfig = shieldedInstanceConfig;
    return this;
  }

  /**
   * Specifies the Shielded VM options for the instances that are created from this template.
   * @return value or {@code null} for none
   */
  public ShieldedVmConfig getShieldedVmConfig() {
    return shieldedVmConfig;
  }

  /**
   * Specifies the Shielded VM options for the instances that are created from this template.
   * @param shieldedVmConfig shieldedVmConfig or {@code null} for none
   */
  public InstanceProperties setShieldedVmConfig(ShieldedVmConfig shieldedVmConfig) {
    this.shieldedVmConfig = shieldedVmConfig;
    return this;
  }

  /**
   * A list of tags to apply to the instances that are created from this template. The tags identify
   * valid sources or targets for network firewalls. The setTags method can modify this list of
   * tags. Each tag within the list must comply with RFC1035.
   * @return value or {@code null} for none
   */
  public Tags getTags() {
    return tags;
  }

  /**
   * A list of tags to apply to the instances that are created from this template. The tags identify
   * valid sources or targets for network firewalls. The setTags method can modify this list of
   * tags. Each tag within the list must comply with RFC1035.
   * @param tags tags or {@code null} for none
   */
  public InstanceProperties setTags(Tags tags) {
    this.tags = tags;
    return this;
  }

  @Override
  public InstanceProperties set(String fieldName, Object value) {
    return (InstanceProperties) super.set(fieldName, value);
  }

  @Override
  public InstanceProperties clone() {
    return (InstanceProperties) super.clone();
  }

}
