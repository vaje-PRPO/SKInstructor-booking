package si.skinstructor.booking.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.time.LocalDate;
import org.springframework.format.annotation.DateTimeFormat;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * BookingRequest
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-11-11T12:52:59.675766707+01:00[Europe/Berlin]")
public class BookingRequest {

  private Long teacherId;

  private Long userId;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
  private LocalDate date;

  private String startTime;

  private Integer durationHours;

  public BookingRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public BookingRequest(Long teacherId, Long userId, LocalDate date, String startTime, Integer durationHours) {
    this.teacherId = teacherId;
    this.userId = userId;
    this.date = date;
    this.startTime = startTime;
    this.durationHours = durationHours;
  }

  public BookingRequest teacherId(Long teacherId) {
    this.teacherId = teacherId;
    return this;
  }

  /**
   * Get teacherId
   * @return teacherId
  */
  @NotNull 
  @Schema(name = "teacherId", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("teacherId")
  public Long getTeacherId() {
    return teacherId;
  }

  public void setTeacherId(Long teacherId) {
    this.teacherId = teacherId;
  }

  public BookingRequest userId(Long userId) {
    this.userId = userId;
    return this;
  }

  /**
   * Get userId
   * @return userId
  */
  @NotNull 
  @Schema(name = "userId", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("userId")
  public Long getUserId() {
    return userId;
  }

  public void setUserId(Long userId) {
    this.userId = userId;
  }

  public BookingRequest date(LocalDate date) {
    this.date = date;
    return this;
  }

  /**
   * Get date
   * @return date
  */
  @NotNull @Valid 
  @Schema(name = "date", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("date")
  public LocalDate getDate() {
    return date;
  }

  public void setDate(LocalDate date) {
    this.date = date;
  }

  public BookingRequest startTime(String startTime) {
    this.startTime = startTime;
    return this;
  }

  /**
   * Get startTime
   * @return startTime
  */
  @NotNull 
  @Schema(name = "startTime", example = "10:00", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("startTime")
  public String getStartTime() {
    return startTime;
  }

  public void setStartTime(String startTime) {
    this.startTime = startTime;
  }

  public BookingRequest durationHours(Integer durationHours) {
    this.durationHours = durationHours;
    return this;
  }

  /**
   * Get durationHours
   * @return durationHours
  */
  @NotNull 
  @Schema(name = "durationHours", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("durationHours")
  public Integer getDurationHours() {
    return durationHours;
  }

  public void setDurationHours(Integer durationHours) {
    this.durationHours = durationHours;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BookingRequest bookingRequest = (BookingRequest) o;
    return Objects.equals(this.teacherId, bookingRequest.teacherId) &&
        Objects.equals(this.userId, bookingRequest.userId) &&
        Objects.equals(this.date, bookingRequest.date) &&
        Objects.equals(this.startTime, bookingRequest.startTime) &&
        Objects.equals(this.durationHours, bookingRequest.durationHours);
  }

  @Override
  public int hashCode() {
    return Objects.hash(teacherId, userId, date, startTime, durationHours);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BookingRequest {\n");
    sb.append("    teacherId: ").append(toIndentedString(teacherId)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    durationHours: ").append(toIndentedString(durationHours)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

