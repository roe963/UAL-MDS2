import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import './vista-producto.js';

class VistaProductos extends PolymerElement {

    static get template() {
        return html`
<style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
                }
            </style>
<vaadin-horizontal-layout class="content" style="width: 100%; height: 100%;" id="vaadinHorizontalLayout">
 <vista-producto style="align-self: stretch; flex-grow: 1;" id="vistaProducto"></vista-producto>
</vaadin-horizontal-layout>
`;
    }

    static get is() {
        return 'vista-productos';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaProductos.is, VistaProductos);
