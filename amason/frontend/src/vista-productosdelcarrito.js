import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';

/**
 * `vista-productosdelcarrito`
 *
 * VistaProductosdelcarrito element.
 *
 * @customElement
 * @polymer
 */
class VistaProductosdelcarrito extends PolymerElement {

    static get template() {
        return html`
            <style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
                }
            </style>
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
