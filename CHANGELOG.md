# 1.0.0 (2024-07-03)


### Features

* add `Grantable` interface ([3b01de5](https://github.com/benkeil/cdktf-lib/commit/3b01de57eba3a45144522e1f96e3fa93aa042203))

# [2.1.0](https://github.com/otto-ec/pdh-da_terraform-cdk-library/compare/v2.0.0...v2.1.0) (2024-05-23)


### Features

* add threshold parameter with default value 1 to errorLogsConfig ([e223a54](https://github.com/otto-ec/pdh-da_terraform-cdk-library/commit/e223a5448e3f5f05d6aed7374fad3e5e4e8e823d))

# [2.0.0](https://github.com/otto-ec/pdh-da_terraform-cdk-library/compare/v1.11.1...v2.0.0) (2024-05-21)


### Features

* **DV-7419:** Allow multiple Kibana alerting rule ([#37](https://github.com/otto-ec/pdh-da_terraform-cdk-library/issues/37)) ([33af32e](https://github.com/otto-ec/pdh-da_terraform-cdk-library/commit/33af32e60e36846879108da35484427d7358fa9d))


### BREAKING CHANGES

* **DV-7419:** `KibanaAlertingRuleBuilder` now requires more configuration and isn't specific to error logging anymore. To migrate existing usage, change `KibanaAlertingRuleBuilder.Config(...)` to `KibanaAlertingRuleBuilder.errorLogsConfig(...)`.

## [1.11.1](https://github.com/otto-ec/pdh-da_terraform-cdk-library/compare/v1.11.0...v1.11.1) (2024-04-08)


### Bug Fixes

* rename `EnvironmentConfig` to `DefaultEnvironmentConfig` ([c6d4825](https://github.com/otto-ec/pdh-da_terraform-cdk-library/commit/c6d4825e3b31f20758a7e3bace62b99d04251ba4))

# [1.11.0](https://github.com/otto-ec/pdh-da_terraform-cdk-library/compare/v1.10.0...v1.11.0) (2024-03-11)


### Features

* **DV-7416:** Add new resource builders ([#11](https://github.com/otto-ec/pdh-da_terraform-cdk-library/issues/11)) ([d731461](https://github.com/otto-ec/pdh-da_terraform-cdk-library/commit/d73146194d4e1cea299039962f37714c6f3e4083))

# [1.10.0](https://github.com/otto-ec/pdh-da_terraform-cdk-library/compare/v1.9.1...v1.10.0) (2024-03-11)


### Features

* **DV-7416:** Support multiple Elastic providers ([#9](https://github.com/otto-ec/pdh-da_terraform-cdk-library/issues/9)) ([f67ced8](https://github.com/otto-ec/pdh-da_terraform-cdk-library/commit/f67ced8d8c20547015c66108188aa8fdd2a180af))

## [1.9.1](https://github.com/otto-ec/pdh-da_terraform-cdk-library/compare/v1.9.0...v1.9.1) (2024-03-09)


### Bug Fixes

* Rename environment `DR` to `DEVELOP_DR` ([ba12f0a](https://github.com/otto-ec/pdh-da_terraform-cdk-library/commit/ba12f0a500bc3595a61f558b068be4d304019bf7))

# [1.9.0](https://github.com/otto-ec/pdh-da_terraform-cdk-library/compare/v1.8.0...v1.9.0) (2024-03-06)


### Features

* add stack id to s3 backend key ([4528d1e](https://github.com/otto-ec/pdh-da_terraform-cdk-library/commit/4528d1e70b2d2c7a329527667fc47e146932e448))

# [1.8.0](https://github.com/otto-ec/pdh-da_terraform-cdk-library/compare/v1.7.1...v1.8.0) (2024-03-05)


### Features

* remove KibanaAlertingRuleBuilder from DataViewBuilder ([276b1c0](https://github.com/otto-ec/pdh-da_terraform-cdk-library/commit/276b1c0814126672715f038a514a4ee577f22ea9))

## [1.7.1](https://github.com/otto-ec/pdh-da_terraform-cdk-library/compare/v1.7.0...v1.7.1) (2024-03-05)


### Bug Fixes

* **DV-8096:** Update default alerting rule configuration ([5a29d02](https://github.com/otto-ec/pdh-da_terraform-cdk-library/commit/5a29d024d3461b9b8c8ac32e345c1317d87ae726))

# [1.7.0](https://github.com/otto-ec/pdh-da_terraform-cdk-library/compare/v1.6.2...v1.7.0) (2024-03-04)


### Features

* Add Kibana Teams Connector and allow overriding AWS service tag ([bc46aee](https://github.com/otto-ec/pdh-da_terraform-cdk-library/commit/bc46aee7f5e1a7b7d0128c94276260fdc7cc957a))

## [1.6.2](https://github.com/otto-ec/pdh-da_terraform-cdk-library/compare/v1.6.1...v1.6.2) (2024-02-29)


### Bug Fixes

* Use correct data type for Elastic API key ([aef7f8e](https://github.com/otto-ec/pdh-da_terraform-cdk-library/commit/aef7f8ebb565b120ede6840ffd2a92749918b99e))

## [1.6.1](https://github.com/otto-ec/pdh-da_terraform-cdk-library/compare/v1.6.0...v1.6.1) (2024-02-29)


### Bug Fixes

* return this in vault provider ([092a2ee](https://github.com/otto-ec/pdh-da_terraform-cdk-library/commit/092a2ee00a407edcb13d98330b5c478adc5c5358))

# [1.6.0](https://github.com/otto-ec/pdh-da_terraform-cdk-library/compare/v1.5.2...v1.6.0) (2024-02-29)


### Features

* add vault provider ([8a95c00](https://github.com/otto-ec/pdh-da_terraform-cdk-library/commit/8a95c00093fac53ea6821cf84314ae8b798abfa5))

## [1.5.2](https://github.com/otto-ec/pdh-da_terraform-cdk-library/compare/v1.5.1...v1.5.2) (2024-02-29)


### Bug Fixes

* Resolve issues with S3 remote backend ([58f665c](https://github.com/otto-ec/pdh-da_terraform-cdk-library/commit/58f665cf018caaf93f5d1b18c93fc2edd408f042))

## [1.5.1](https://github.com/otto-ec/pdh-da_terraform-cdk-library/compare/v1.5.0...v1.5.1) (2024-02-29)


### Bug Fixes

* Use proper file ending for remote states ([beec8d1](https://github.com/otto-ec/pdh-da_terraform-cdk-library/commit/beec8d16f955ef17e97f5ce2833552175a092968))

# [1.5.0](https://github.com/otto-ec/pdh-da_terraform-cdk-library/compare/v1.4.1...v1.5.0) (2024-02-29)


### Features

* Set AWS default tags ([65264a3](https://github.com/otto-ec/pdh-da_terraform-cdk-library/commit/65264a3766ae6966c53927b636c9dea5ea1b546e))

## [1.4.1](https://github.com/otto-ec/pdh-da_terraform-cdk-library/compare/v1.4.0...v1.4.1) (2024-02-29)


### Bug Fixes

* Include resource type in auto-generated names ([056ac0e](https://github.com/otto-ec/pdh-da_terraform-cdk-library/commit/056ac0eed5d588e59ce86859e2e0d6dbea54b7ea))

# [1.4.0](https://github.com/otto-ec/pdh-da_terraform-cdk-library/compare/v1.3.2...v1.4.0) (2024-02-29)


### Features

* Replace deprecated S3 bucket configuration ([9101c20](https://github.com/otto-ec/pdh-da_terraform-cdk-library/commit/9101c20802f7d3465474a6e06886ea35e8a89e09))

## [1.3.2](https://github.com/otto-ec/pdh-da_terraform-cdk-library/compare/v1.3.1...v1.3.2) (2024-02-29)


### Bug Fixes

* Actually apply attributes to DynamoDB table ([aa697c8](https://github.com/otto-ec/pdh-da_terraform-cdk-library/commit/aa697c8ddd12b46db891a8335190337f6dc72ae5))

## [1.3.1](https://github.com/otto-ec/pdh-da_terraform-cdk-library/compare/v1.3.0...v1.3.1) (2024-02-29)


### Bug Fixes

* Undo hardcoded S3 bucket name and remove unnecessary parameter ([b079500](https://github.com/otto-ec/pdh-da_terraform-cdk-library/commit/b079500981abc8964f3a1c0463368df556d30894))

# [1.3.0](https://github.com/otto-ec/pdh-da_terraform-cdk-library/compare/v1.2.0...v1.3.0) (2024-02-29)


### Features

* add functions to get bucket name and lock table name for aws state backend ([3241429](https://github.com/otto-ec/pdh-da_terraform-cdk-library/commit/3241429081d346d1c21385ef82c1d70a156bd759))

# [1.2.0](https://github.com/otto-ec/pdh-da_terraform-cdk-library/compare/v1.1.0...v1.2.0) (2024-02-28)


### Features

* Add `withHashKey` method for `DynamoDbBuilder` ([2e41b64](https://github.com/otto-ec/pdh-da_terraform-cdk-library/commit/2e41b642c7f296a52c04c146bf44e71bfc7bdbe9))

# [1.1.0](https://github.com/otto-ec/pdh-da_terraform-cdk-library/compare/v1.0.1...v1.1.0) (2024-02-28)


### Features

* add builder for dynamoDb and s3Bucket ([38eb021](https://github.com/otto-ec/pdh-da_terraform-cdk-library/commit/38eb021aa62fac44ad27b9cb62ead7d8e491d209))

## [1.0.1](https://github.com/otto-ec/pdh-da_terraform-cdk-library/compare/v1.0.0...v1.0.1) (2024-02-28)


### Bug Fixes

* trigger build ([8bcaeaf](https://github.com/otto-ec/pdh-da_terraform-cdk-library/commit/8bcaeaffb07427bd387af664ead399f74882129c))

# 1.0.0 (2024-02-28)


### Bug Fixes

* add cdktf-cli get to build ([da0e091](https://github.com/otto-ec/pdh-da_terraform-cdk-library/commit/da0e091a90e971e85a45ccfd80d5c651c1881b52))
* add java config ([f32b8ec](https://github.com/otto-ec/pdh-da_terraform-cdk-library/commit/f32b8ec696e38a17622a3208b724cd8d6ffba70e))
