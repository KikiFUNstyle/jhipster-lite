package tech.jhipster.lite.generator.client.angular.core.infrastructure.primary;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import tech.jhipster.lite.generator.client.angular.core.application.AngularApplicationService;
import tech.jhipster.lite.module.domain.resource.JHipsterModuleOrganization;
import tech.jhipster.lite.module.domain.resource.JHipsterModulePropertiesDefinition;
import tech.jhipster.lite.module.domain.resource.JHipsterModuleResource;

@Configuration
class AngularCoreModuleConfiguration {

  @Bean
  JHipsterModuleResource angularModule(AngularApplicationService angular) {
    return JHipsterModuleResource
      .builder()
      .slug("angular-core")
      .propertiesDefinition(JHipsterModulePropertiesDefinition.builder().addBasePackage().addProjectBaseName().addProjectName().build())
      .apiDoc("Angular", "Add Angular + Angular CLI")
      .organization(
        JHipsterModuleOrganization.builder().feature("client-core").addModuleDependency("init").addModuleDependency("prettier").build()
      )
      .tags("client", "angular")
      .factory(angular::buildInitModule);
  }
}
