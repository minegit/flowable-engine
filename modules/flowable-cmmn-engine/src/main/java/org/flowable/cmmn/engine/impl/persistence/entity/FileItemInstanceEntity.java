/* Licensed under the Apache License, Version 2.0 (the "License");
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
package org.flowable.cmmn.engine.impl.persistence.entity;

import org.flowable.cmmn.api.runtime.FileItemInstance;
import org.flowable.common.engine.impl.db.HasRevision;
import org.flowable.common.engine.impl.persistence.entity.Entity;

/**
 * @author Joram Barrez
 */
public interface FileItemInstanceEntity extends Entity, HasRevision, FileItemInstance {

    void setCaseInstanceId(String caseInstanceId);

    void setCaseDefinitionId(String caseDefinitionId);

    void setFileItemKey(String fileItemKey);

    void setDefinitionType(String definitionType);

    void setContentId(String contentId);

}