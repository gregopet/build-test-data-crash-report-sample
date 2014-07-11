package btd.test

/**
* See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
*/
class AuthorSpec extends SpecBase {

	def setup() {
	}

	def cleanup() {
	}

	void "test anything, really"() {
		expect:
		Author.build().name != null
	}
}
