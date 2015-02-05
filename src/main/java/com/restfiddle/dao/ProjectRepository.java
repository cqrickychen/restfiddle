/*
 * Copyright 2014 Ranjan Kumar
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.restfiddle.dao;

import java.util.List;

import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.repository.query.Param;

import com.restfiddle.entity.Project;

public interface ProjectRepository extends RfRepository<Project, String> {

//    @Query("SELECT p FROM Project p WHERE p.workspace.id = :workspaceId")
    @Query("{ 'workspaceId' : '' }")
    public List<Project> findProjectsFromAWorkspace(@Param("workspaceId") Long workspaceId);
}
