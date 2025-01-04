package springboot.automate.tests

import org.eclipse.xtext.testing.InjectWith
import org.eclipse.xtext.testing.extensions.InjectionExtension
import org.eclipse.xtext.testing.util.ParseHelper
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import springboot.automate.grabDsl.Model
import com.google.inject.Inject

@ExtendWith(InjectionExtension)
@InjectWith(GrabDslInjectorProvider)
class GrabDslParsingTestGroovy {

	@Inject
	ParseHelper<Model> parseHelper

	@Test
	void testParsePomXmlGroupId() {
		def result = parseHelper.parse('''
            package com.project {
                pomXml {
                    groupId = "com.project"
			        artifactId = "springboot-application"
			        version = "1.0.0"
			        packaging = "jar"
			
			        properties {
			            javaVersion = "1.8"
			            springBootVersion = "2.7.5"
			        }
					
					dependencies {
				        dependency {
				            groupId = "org.springframework.boot"
				            artifactId = "spring-boot-starter-web"
				            version = "2.5.6"
				            scope = "compile"
				        }
					}

					build {
			            plugins {
			                plugin {
			                    groupId = "org.apache.maven.plugins"
			                    artifactId = "maven-compiler-plugin"
			                    version = "3.8.1"
			                    configuration {
			                        source = "${java.version}"
			                        target = "${java.version}"
			                    }
			                }
			            }
			        }
                }
            }
        ''')
		Assertions.assertNotNull(result, "Model should be parsed successfully.")
		def errors = result.eResource().errors
		Assertions.assertTrue(errors.isEmpty(), "Unexpected errors: ${errors.join(", ")}")
	}

	@Test
	void testParseDtoClass() {
		def result = parseHelper.parse('''
            package com.project {
                package dto {
                    @Data
			        @NoArgsConstructor
			        @AllArgsConstructor
			        class UsersDto {
			       
			            private id: UUID
			            private emailId: String
			        }
                }
            }
        ''')
		Assertions.assertNotNull(result, "DTO class should be parsed successfully.")
		def errors = result.eResource().errors
		Assertions.assertTrue(errors.isEmpty(), "Unexpected errors: ${errors.join(", ")}")
	}

	@Test
	void testParseEntityClass() {
		def result = parseHelper.parse('''
            package com.project {
                package entity {
                    class UsersEntity {
                        private id: UUID
                    }
                }
            }
        ''')
		Assertions.assertNotNull(result, "Entity class should be parsed successfully.")
		def errors = result.eResource().errors
		Assertions.assertTrue(errors.isEmpty(), "Unexpected errors: ${errors.join(", ")}")
	}

	@Test
	void testParseServiceInterface() {
		def result = parseHelper.parse('''
            package com.project {
                package serviceInterface {
                    interface IUsersService {
                        public getAllUsers(): List<UsersDto>
                    }
                }
            }
        ''')
		Assertions.assertNotNull(result, "Service interface should be parsed successfully.")
		def errors = result.eResource().errors
		Assertions.assertTrue(errors.isEmpty(), "Unexpected errors: ${errors.join(", ")}")
	}

	@Test
	void testParseControllerClass() {
		def result = parseHelper.parse('''
            package com.project {
                package controller {
                    class UsersController {
                        private iUsersService: IUsersService
                    }
                }
            }
        ''')
		Assertions.assertNotNull(result, "Controller class should be parsed successfully.")
		def errors = result.eResource().errors
		Assertions.assertTrue(errors.isEmpty(), "Unexpected errors: ${errors.join(", ")}")
	}
}




