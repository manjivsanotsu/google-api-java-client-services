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

package com.google.api.services.dataproc.model;

/**
 * A Cloud Dataproc job resource.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Dataproc API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Job extends com.google.api.client.json.GenericJson {

  /**
   * Output only. If present, the location of miscellaneous control files which may be used as part
   * of job setup and handling. If not present, control files may be placed in the same location as
   * driver_output_uri.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String driverControlFilesUri;

  /**
   * Output only. A URI pointing to the location of the stdout of the job's driver program.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String driverOutputResourceUri;

  /**
   * Job is a Hadoop job.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private HadoopJob hadoopJob;

  /**
   * Job is a Hive job.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private HiveJob hiveJob;

  /**
   * Output only. A UUID that uniquely identifies a job within the project over time. This is in
   * contrast to a user-settable reference.job_id that may be reused over time.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String jobUuid;

  /**
   * Optional. The labels to associate with this job. Label keys must contain 1 to 63 characters,
   * and must conform to RFC 1035 (https://www.ietf.org/rfc/rfc1035.txt). Label values may be empty,
   * but, if present, must contain 1 to 63 characters, and must conform to RFC 1035
   * (https://www.ietf.org/rfc/rfc1035.txt). No more than 32 labels can be associated with a job.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.String> labels;

  /**
   * Job is a Pig job.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private PigJob pigJob;

  /**
   * Required. Job information, including how, when, and where to run the job.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private JobPlacement placement;

  /**
   * Job is a Pyspark job.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private PySparkJob pysparkJob;

  /**
   * Optional. The fully qualified reference to the job, which can be used to obtain the equivalent
   * REST path of the job resource. If this property is not specified when a job is created, the
   * server generates a job_id.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private JobReference reference;

  /**
   * Optional. Job scheduling configuration.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private JobScheduling scheduling;

  /**
   * Job is a Spark job.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private SparkJob sparkJob;

  /**
   * Job is a SparkR job.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private SparkRJob sparkRJob;

  /**
   * Job is a SparkSql job.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private SparkSqlJob sparkSqlJob;

  /**
   * Output only. The job status. Additional application-specific status information may be
   * contained in the type_job and yarn_applications fields.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private JobStatus status;

  /**
   * Output only. The previous job status.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<JobStatus> statusHistory;

  /**
   * Output only. The collection of YARN applications spun up by this job.Beta Feature: This report
   * is available for testing purposes only. It may be changed before final release.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<YarnApplication> yarnApplications;

  /**
   * Output only. If present, the location of miscellaneous control files which may be used as part
   * of job setup and handling. If not present, control files may be placed in the same location as
   * driver_output_uri.
   * @return value or {@code null} for none
   */
  public java.lang.String getDriverControlFilesUri() {
    return driverControlFilesUri;
  }

  /**
   * Output only. If present, the location of miscellaneous control files which may be used as part
   * of job setup and handling. If not present, control files may be placed in the same location as
   * driver_output_uri.
   * @param driverControlFilesUri driverControlFilesUri or {@code null} for none
   */
  public Job setDriverControlFilesUri(java.lang.String driverControlFilesUri) {
    this.driverControlFilesUri = driverControlFilesUri;
    return this;
  }

  /**
   * Output only. A URI pointing to the location of the stdout of the job's driver program.
   * @return value or {@code null} for none
   */
  public java.lang.String getDriverOutputResourceUri() {
    return driverOutputResourceUri;
  }

  /**
   * Output only. A URI pointing to the location of the stdout of the job's driver program.
   * @param driverOutputResourceUri driverOutputResourceUri or {@code null} for none
   */
  public Job setDriverOutputResourceUri(java.lang.String driverOutputResourceUri) {
    this.driverOutputResourceUri = driverOutputResourceUri;
    return this;
  }

  /**
   * Job is a Hadoop job.
   * @return value or {@code null} for none
   */
  public HadoopJob getHadoopJob() {
    return hadoopJob;
  }

  /**
   * Job is a Hadoop job.
   * @param hadoopJob hadoopJob or {@code null} for none
   */
  public Job setHadoopJob(HadoopJob hadoopJob) {
    this.hadoopJob = hadoopJob;
    return this;
  }

  /**
   * Job is a Hive job.
   * @return value or {@code null} for none
   */
  public HiveJob getHiveJob() {
    return hiveJob;
  }

  /**
   * Job is a Hive job.
   * @param hiveJob hiveJob or {@code null} for none
   */
  public Job setHiveJob(HiveJob hiveJob) {
    this.hiveJob = hiveJob;
    return this;
  }

  /**
   * Output only. A UUID that uniquely identifies a job within the project over time. This is in
   * contrast to a user-settable reference.job_id that may be reused over time.
   * @return value or {@code null} for none
   */
  public java.lang.String getJobUuid() {
    return jobUuid;
  }

  /**
   * Output only. A UUID that uniquely identifies a job within the project over time. This is in
   * contrast to a user-settable reference.job_id that may be reused over time.
   * @param jobUuid jobUuid or {@code null} for none
   */
  public Job setJobUuid(java.lang.String jobUuid) {
    this.jobUuid = jobUuid;
    return this;
  }

  /**
   * Optional. The labels to associate with this job. Label keys must contain 1 to 63 characters,
   * and must conform to RFC 1035 (https://www.ietf.org/rfc/rfc1035.txt). Label values may be empty,
   * but, if present, must contain 1 to 63 characters, and must conform to RFC 1035
   * (https://www.ietf.org/rfc/rfc1035.txt). No more than 32 labels can be associated with a job.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.String> getLabels() {
    return labels;
  }

  /**
   * Optional. The labels to associate with this job. Label keys must contain 1 to 63 characters,
   * and must conform to RFC 1035 (https://www.ietf.org/rfc/rfc1035.txt). Label values may be empty,
   * but, if present, must contain 1 to 63 characters, and must conform to RFC 1035
   * (https://www.ietf.org/rfc/rfc1035.txt). No more than 32 labels can be associated with a job.
   * @param labels labels or {@code null} for none
   */
  public Job setLabels(java.util.Map<String, java.lang.String> labels) {
    this.labels = labels;
    return this;
  }

  /**
   * Job is a Pig job.
   * @return value or {@code null} for none
   */
  public PigJob getPigJob() {
    return pigJob;
  }

  /**
   * Job is a Pig job.
   * @param pigJob pigJob or {@code null} for none
   */
  public Job setPigJob(PigJob pigJob) {
    this.pigJob = pigJob;
    return this;
  }

  /**
   * Required. Job information, including how, when, and where to run the job.
   * @return value or {@code null} for none
   */
  public JobPlacement getPlacement() {
    return placement;
  }

  /**
   * Required. Job information, including how, when, and where to run the job.
   * @param placement placement or {@code null} for none
   */
  public Job setPlacement(JobPlacement placement) {
    this.placement = placement;
    return this;
  }

  /**
   * Job is a Pyspark job.
   * @return value or {@code null} for none
   */
  public PySparkJob getPysparkJob() {
    return pysparkJob;
  }

  /**
   * Job is a Pyspark job.
   * @param pysparkJob pysparkJob or {@code null} for none
   */
  public Job setPysparkJob(PySparkJob pysparkJob) {
    this.pysparkJob = pysparkJob;
    return this;
  }

  /**
   * Optional. The fully qualified reference to the job, which can be used to obtain the equivalent
   * REST path of the job resource. If this property is not specified when a job is created, the
   * server generates a job_id.
   * @return value or {@code null} for none
   */
  public JobReference getReference() {
    return reference;
  }

  /**
   * Optional. The fully qualified reference to the job, which can be used to obtain the equivalent
   * REST path of the job resource. If this property is not specified when a job is created, the
   * server generates a job_id.
   * @param reference reference or {@code null} for none
   */
  public Job setReference(JobReference reference) {
    this.reference = reference;
    return this;
  }

  /**
   * Optional. Job scheduling configuration.
   * @return value or {@code null} for none
   */
  public JobScheduling getScheduling() {
    return scheduling;
  }

  /**
   * Optional. Job scheduling configuration.
   * @param scheduling scheduling or {@code null} for none
   */
  public Job setScheduling(JobScheduling scheduling) {
    this.scheduling = scheduling;
    return this;
  }

  /**
   * Job is a Spark job.
   * @return value or {@code null} for none
   */
  public SparkJob getSparkJob() {
    return sparkJob;
  }

  /**
   * Job is a Spark job.
   * @param sparkJob sparkJob or {@code null} for none
   */
  public Job setSparkJob(SparkJob sparkJob) {
    this.sparkJob = sparkJob;
    return this;
  }

  /**
   * Job is a SparkR job.
   * @return value or {@code null} for none
   */
  public SparkRJob getSparkRJob() {
    return sparkRJob;
  }

  /**
   * Job is a SparkR job.
   * @param sparkRJob sparkRJob or {@code null} for none
   */
  public Job setSparkRJob(SparkRJob sparkRJob) {
    this.sparkRJob = sparkRJob;
    return this;
  }

  /**
   * Job is a SparkSql job.
   * @return value or {@code null} for none
   */
  public SparkSqlJob getSparkSqlJob() {
    return sparkSqlJob;
  }

  /**
   * Job is a SparkSql job.
   * @param sparkSqlJob sparkSqlJob or {@code null} for none
   */
  public Job setSparkSqlJob(SparkSqlJob sparkSqlJob) {
    this.sparkSqlJob = sparkSqlJob;
    return this;
  }

  /**
   * Output only. The job status. Additional application-specific status information may be
   * contained in the type_job and yarn_applications fields.
   * @return value or {@code null} for none
   */
  public JobStatus getStatus() {
    return status;
  }

  /**
   * Output only. The job status. Additional application-specific status information may be
   * contained in the type_job and yarn_applications fields.
   * @param status status or {@code null} for none
   */
  public Job setStatus(JobStatus status) {
    this.status = status;
    return this;
  }

  /**
   * Output only. The previous job status.
   * @return value or {@code null} for none
   */
  public java.util.List<JobStatus> getStatusHistory() {
    return statusHistory;
  }

  /**
   * Output only. The previous job status.
   * @param statusHistory statusHistory or {@code null} for none
   */
  public Job setStatusHistory(java.util.List<JobStatus> statusHistory) {
    this.statusHistory = statusHistory;
    return this;
  }

  /**
   * Output only. The collection of YARN applications spun up by this job.Beta Feature: This report
   * is available for testing purposes only. It may be changed before final release.
   * @return value or {@code null} for none
   */
  public java.util.List<YarnApplication> getYarnApplications() {
    return yarnApplications;
  }

  /**
   * Output only. The collection of YARN applications spun up by this job.Beta Feature: This report
   * is available for testing purposes only. It may be changed before final release.
   * @param yarnApplications yarnApplications or {@code null} for none
   */
  public Job setYarnApplications(java.util.List<YarnApplication> yarnApplications) {
    this.yarnApplications = yarnApplications;
    return this;
  }

  @Override
  public Job set(String fieldName, Object value) {
    return (Job) super.set(fieldName, value);
  }

  @Override
  public Job clone() {
    return (Job) super.clone();
  }

}
