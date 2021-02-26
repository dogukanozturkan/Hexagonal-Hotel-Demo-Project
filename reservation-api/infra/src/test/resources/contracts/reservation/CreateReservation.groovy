package reservation

import org.springframework.cloud.contract.spec.Contract

Contract.make {
    name "create reservation"
    description "should create reservation"

    request {
        url '/api/v1/reservations'
        headers {
            header(contentType(), applicationJson())
        }

        method POST()
        body(
                """
                {
                    "hotel_id": "1",
                    "room_name": "1",
                    "check_in": "2021-04-01",
                    "check_out": "2021-04-01",
                    "currency": "EUR",
                    "amount": 340,
                    "adult": 2,
                    "children": 2,
                    "customer": {
                        "name": "John",
                        "last_name": "Doe",
                        "title": "Mr",
                        "birth_date": "1950-01-15",
                        "passport_no": "34HJ76894"
                        "country": "Germany",
                        "phone_number": "09091239112",
                        "email": "foo@bar.com"
                    },
                    "guests": [{
                        "name": "Emma",
                        "last_name": "Doe",
                        "title": "Mr",
                        "birth_date": "1953-06-22",
                        "passport_no": "343JL894"
                        "country": "Germany",
                        "phone_number": "09091214421",
                        "email": "sam@doe.com"
                    },{
                        "name": "Sam",
                        "last_name": "Doe",
                        "title": "Mr",
                        "birth_date": "2010-06-22",
                        "passport_no": "343JL894"
                        "country": "Germany",
                        "phone_number": "09091214421",
                        "email": "sam@doe.com"
                    },{
                        "name": "Mia",
                        "last_name": "Doe",
                        "title": "Ms",
                        "birth_date": "2012-11-12",
                        "passport_no": "34HJ76877"
                        "country": "Germany",
                        "phone_number": "09091214422",
                        "email": "mia@doe.com"
                    }]
                }
                """
        )
    }

    response {
        status CREATED()
        headers {
            header(contentType(), applicationJson())
        }
        body(
                """
                {
                    "reservation_id": "J7687"
                }
                """
        )
    }
}