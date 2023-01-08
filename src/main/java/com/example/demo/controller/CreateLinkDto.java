package com.example.demo.controller;

import com.example.demo.LinkDto;
import lombok.Builder;

import java.time.LocalDate;

@Builder
final
class CreateLinkDto {
    private final String id;
    private final String targetUrl;
    private final LocalDate expirationDate;
    private final String email;

    CreateLinkDto(final String id, final String targetUrl, final LocalDate expirationDate, final String email) {
        this.id = id;
        this.targetUrl = targetUrl;
        this.expirationDate = expirationDate;
        this.email = email;
    }

    LinkDto toDto() {
        return new LinkDto(id, email, targetUrl, expirationDate, 0);
    }

    public String getId() {
        return this.id;
    }

    public String getTargetUrl() {
        return this.targetUrl;
    }

    public LocalDate getExpirationDate() {
        return this.expirationDate;
    }

    public String getEmail() {
        return this.email;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof CreateLinkDto)) return false;
        final CreateLinkDto other = (CreateLinkDto) o;
        final Object this$id = this.getId();
        final Object other$id = other.getId();
        if (this$id == null ? other$id != null : !this$id.equals(other$id)) return false;
        final Object this$targetUrl = this.getTargetUrl();
        final Object other$targetUrl = other.getTargetUrl();
        if (this$targetUrl == null ? other$targetUrl != null : !this$targetUrl.equals(other$targetUrl)) return false;
        final Object this$expirationDate = this.getExpirationDate();
        final Object other$expirationDate = other.getExpirationDate();
        if (this$expirationDate == null ? other$expirationDate != null : !this$expirationDate.equals(other$expirationDate))
            return false;
        final Object this$email = this.getEmail();
        final Object other$email = other.getEmail();
        if (this$email == null ? other$email != null : !this$email.equals(other$email)) return false;
        return true;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $id = this.getId();
        result = result * PRIME + ($id == null ? 43 : $id.hashCode());
        final Object $targetUrl = this.getTargetUrl();
        result = result * PRIME + ($targetUrl == null ? 43 : $targetUrl.hashCode());
        final Object $expirationDate = this.getExpirationDate();
        result = result * PRIME + ($expirationDate == null ? 43 : $expirationDate.hashCode());
        final Object $email = this.getEmail();
        result = result * PRIME + ($email == null ? 43 : $email.hashCode());
        return result;
    }

    public String toString() {
        return "CreateLinkDto(id=" + this.getId() + ", targetUrl=" + this.getTargetUrl() + ", expirationDate=" + this.getExpirationDate() + ", email=" + this.getEmail() + ")";
    }
}
