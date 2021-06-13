# Code-Coverage-Test-App [![codecov](https://codecov.io/gh/lixw1021/Code-Coverage-Test-App/branch/master/graph/badge.svg?token=8RVGM9LNES)](https://codecov.io/gh/lixw1021/Code-Coverage-Test-App)
#### Android + Jacoco + GitHub Actions + Codecov 

## Introduction
This is an Android App used to introduce Unit Test Coverage for Android project.

The project is using [Jacoco](https://github.com/jacoco/jacoco) to generate code coverage report, [Github Actions](https://github.com/features/actions) run and upload coverage report to [Codecov](https://about.codecov.io/product/features/). Codecov provides different features, like Source Code Coverage, Pull Request Comments, Status Checks, Badges, Report Merging, GitHub Checks and etc. Take a look at different [PRs](https://github.com/lixw1021/Code-Coverage-Test-App/pulls) to see how it works during code review. 

## Guide

#### Generate Coverage Reports

Add Jacoco plugin and dependency, and then create a jacocoReport task in [build.gradle](https://github.com/lixw1021/Code-Coverage-Test-App/blob/master/app/build.gradle), run the following command to generate coverage reports which can be found in project's dir: `app/build/reports/jacoco`.
```
./gradlew jacocoReport
```
This is used to generate jacoco report in your android studio, you don't have to do anything if you only view it in codecov, because it runs in github workflow

#### Upload Coverage Reports to Codecov

Github Actions is used to run the `jacocoReport` and upload report to codecov, you can find the workflows file in [jacoco.yml](https://github.com/lixw1021/Code-Coverage-Test-App/blob/master/.github/workflows/jacoco.yml)

#### View Detailed Report in Codecov
Signup account in [codecov](https://about.codecov.io/blog/) and add your repo into codecov account. Where you can find detailed coverage report based on projet, Commits, Branches, Pull Requests, Diff and etc.

<img width="600" alt="Screen Shot 2021-06-13 at 10 23 38 PM" src="https://user-images.githubusercontent.com/24383706/121822284-328a0980-cc96-11eb-83a8-97acd754b3ca.png"><img width="600" alt="Screen Shot 2021-06-13 at 10 23 58 PM" src="https://user-images.githubusercontent.com/24383706/121822282-30c04600-cc96-11eb-87d3-f4659c9960f6.png">

#### View Detailed Report in Github with [sourcegraph](https://docs.codecov.com/docs/browser-extension)
<img width="600" alt="Screen Shot 2021-06-13 at 10 29 13 PM" src="https://user-images.githubusercontent.com/24383706/121822384-cc51b680-cc96-11eb-974a-1c3f5c32c43a.png">




## License

The source code for the site is licensed under the MIT license, which you can find in the [LICENSE](https://github.com/lixw1021/Code-Coverage-Test-App/blob/master/LICENSE) file.
