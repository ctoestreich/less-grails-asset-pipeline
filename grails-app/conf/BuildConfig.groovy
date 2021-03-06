grails.project.work.dir = 'target'

grails.project.dependency.resolution = {

	inherits 'global'
	log 'warn'

	repositories {
		grailsCentral()
		grailsPlugins()
		mavenCentral()
		jcenter()
	}

	dependencies {
		compile 'com.bertramlabs.plugins:less-asset-pipeline:2.6.7'
	}

	plugins {
		runtime ":asset-pipeline:2.6.7"

		build ':release:3.1.2', ':rest-client-builder:1.0.3', {
			export = false
		}
	}
}
