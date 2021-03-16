import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import './vista-productodelcarrito.js';

class VistaProductosdelcarrito extends PolymerElement {

    static get template() {
        return html`
<style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
                }
            </style>
<vaadin-vertical-layout style="width: 100%; height: 100%;">
 <vista-productodelcarrito style="align-self: stretch;"></vista-productodelcarrito>
</vaadin-vertical-layout>
`;
    }

    static get is() {
        return 'vista-productosdelcarrito';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaProductosdelcarrito.is, VistaProductosdelcarrito);
