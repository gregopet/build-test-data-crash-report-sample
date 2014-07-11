package btd.test

import grails.test.mixin.TestFor
import grails.buildtestdata.mixin.Build
import spock.lang.Specification
import grails.test.mixin.hibernate.HibernateTestMixin
import grails.test.mixin.gorm.Domain
/**
* See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
*/
@Domain(Author)
@Build(Author)
@TestMixin(HibernateTestMixin)
class AuthorSpec extends Specification {

	def setup() {
	}

	def cleanup() {
	}

	void "test anything, really"() {
		expect:
		Author.build().name != null
	}
}
