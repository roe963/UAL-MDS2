import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';

/**
 * `vista-responder`
 *
 * VistaResponder element.
 *
 * @customElement
 * @polymer
 */
class VistaResponder extends PolymerElement {

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
        return 'vista-responder';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaResponder.is, VistaResponder);
