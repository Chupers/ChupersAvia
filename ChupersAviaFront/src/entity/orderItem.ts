import { Airport } from './airport'

export class OrderItem{
    orderItemId:number
    pricePerSeat:number
    airportTo:Airport
    airportFrom:Airport
    dateTo:Date
    timeOfDeparture:String
    arrivalTime:String
}