package com.wrike.maven_modules_merger.pom_parser.bean;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NonNull;

import static com.wrike.maven_modules_merger.pom_parser.bean.DependencyScope.COMPILE;

/**
 * Author: Daniil Shylko
 * Date: 17.08.2022
 */
@Data
@Builder
public class Dependency {

    @NonNull
    private String groupId;
    @NonNull
    private String artifactId;
    @EqualsAndHashCode.Exclude
    private String version;
    @EqualsAndHashCode.Exclude
    @Builder.Default
    private DependencyScope scope = COMPILE;

}