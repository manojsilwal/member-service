package com.techforce.memberservice.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Member {
    private int mid;
    private String name;
}
